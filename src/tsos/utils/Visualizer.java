package tsos.utils;

import tsos.common.FFT;

public class Visualizer implements Runnable {
  public static final int WAVE_LENGTH = 512;
  private double[] dataSource;
  private double[] dataFilter;
  private Filter filter;

  public Visualizer(Filter filter, double[] dataSource, double[] dataFilter) {
    this.filter = filter;
    this.dataSource = dataSource;
    this.dataFilter = dataFilter;
  }

  public void run() {
    while (true) {
      FFT fData1 = new FFT();
      FFT fData2 = new FFT();
      if (this.filter.getCurrentSourceData() != null && this.filter.getCurrentFilterData() != null) {
        fData1.FFTAnalysis(this.filter.getCurrentSourceData(), Visualizer.WAVE_LENGTH);
        fData2.FFTAnalysis(this.filter.getCurrentFilterData(), Visualizer.WAVE_LENGTH);

        for (int i = 0; i < fData1.getFFTData().length; i++) {
          this.dataSource[i] = Math.log10(fData1.getFFTData()[i] * 0.1) / 10;
          this.dataFilter[i] = Math.log10(fData2.getFFTData()[i] * 0.1) / 10;
        }
      }
    }
  }
}
