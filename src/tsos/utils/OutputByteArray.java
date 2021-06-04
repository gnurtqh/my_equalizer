package tsos.utils;

import javax.sound.sampled.SourceDataLine;

import tsos.common.RingBuffer;

public class OutputByteArray implements Runnable {
  private SourceDataLine audioLine;
  private RingBuffer data;

  public OutputByteArray(SourceDataLine audioLine, RingBuffer data) {
    this.audioLine = audioLine;
    this.data = data;
  }

  public void run() {

    while (true) {
      byte[] array = new byte[1024];
      for (int i = 0; i < array.length; i += 2) {
        short sample = this.data.read();
        array[i] = (byte) (sample);
        array[i + 1] = (byte) (sample >>> 8);
      }
      audioLine.write(array, 0, array.length);
    }
  }
}
