package tsos.utils;

import tsos.common.Coefficient;
import tsos.common.RingBuffer;

public class Filter implements Runnable {
  private RingBuffer buffer;
  private RingBuffer data;
  private short[] currentSourceData;
  private short[] currentFilterData;
  private boolean isFiltered;

  public Filter(RingBuffer buffer, RingBuffer data) {
    this.buffer = buffer;
    this.data = data;
    this.isFiltered = false;
  }

  public boolean isFiltered() {
    return this.isFiltered;
  }

  public void setFilter(boolean value) {
    this.isFiltered = value;
  }

  public RingBuffer getBuffer() {
    return this.buffer;
  }

  public short[] getCurrentSourceData() {
    return this.currentSourceData;
  }

  public short[] getCurrentFilterData() {
    return this.currentFilterData;
  }

  public void run() {
    double[] tempArr = new double[Coefficient.orderFilter];
    short[] tempSourceData = new short[512];
    short[] tempFilterData = new short[512];
    int index = 0;
    while (true) {
      if (index == 512) {
        this.currentSourceData = tempSourceData.clone();
        this.currentFilterData = tempFilterData.clone();
        index = 0;
      }
      short currentData = this.data.read();
      tempSourceData[index] = currentData;
      if (this.isFiltered) {
        for (int coeffIndex = 0; coeffIndex < Coefficient.orderFilter; coeffIndex++) {
          double tmp = currentData * Coefficient.coeffs[coeffIndex];
          if (coeffIndex == Coefficient.orderFilter - 1)
            tempArr[coeffIndex] = tmp;
          else
            tempArr[coeffIndex] = tempArr[coeffIndex + 1] + tmp;
        }
        tempFilterData[index] = (short) (tempArr[0]);
        this.buffer.write((short) (tempArr[0]));

      } else {
        tempFilterData[index] = (short) (currentData);
        this.buffer.write((short) (currentData));
      }
      index++;
    }
  }
}
