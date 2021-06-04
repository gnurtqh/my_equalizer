package tsos.player;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import tsos.common.RingBuffer;
import tsos.utils.FileReader;
import tsos.utils.Filter;
import tsos.utils.OutputByteArray;
import tsos.utils.Visualizer;

public class Player {
  private int RINGBUFFER_SIZE = 1024;
  private File file;

  private AudioInputStream audioStream;
  private AudioFormat format;
  private DataLine.Info info;
  private SourceDataLine audioLine;
  private RingBuffer rb1;
  private RingBuffer rb2;
  private FileReader fileReader;
  private Filter filter;
  private OutputByteArray byteArray;
  private Visualizer visualizer;
  private double[] dataSource;
  private double[] dataFilter;

  private Thread readfile;
  private Thread filterAudio;
  private Thread output;
  private Thread visualizeData;

  public Player(File file) {
    this.file = file;
  }

  public void setBufferSize(int size) {
    this.RINGBUFFER_SIZE = size;
  }

  public void setFilter(boolean value) {
    this.filter.setFilter(value);
  }

  public double[] getDatasource() {
    return this.dataSource;
  }

  public double[] getDataFilter() {
    return this.dataFilter;
  }

  public void play() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
    this.audioStream = AudioSystem.getAudioInputStream(this.file);
    this.format = audioStream.getFormat();
    this.info = new DataLine.Info(SourceDataLine.class, format);
    this.audioLine = (SourceDataLine) AudioSystem.getLine(info);
    this.audioLine.open(format);
    this.audioLine.start();

    this.rb1 = new RingBuffer(this.RINGBUFFER_SIZE);
    this.rb2 = new RingBuffer(this.RINGBUFFER_SIZE);
    this.dataSource = new double[Visualizer.WAVE_LENGTH];
    this.dataFilter = new double[Visualizer.WAVE_LENGTH];

    this.fileReader = new FileReader(this.rb1, this.audioStream);
    this.filter = new Filter(this.rb2, this.rb1);
    this.byteArray = new OutputByteArray(this.audioLine, this.rb2);
    this.visualizer = new Visualizer(this.filter, this.dataSource, this.dataFilter);

    this.readfile = new Thread(this.fileReader);
    this.filterAudio = new Thread(this.filter);
    this.output = new Thread(this.byteArray);
    this.visualizeData = new Thread(this.visualizer);

    this.readfile.start();
    this.filterAudio.start();
    this.output.start();
    this.visualizeData.start();
    this.audioLine.drain();

    this.audioLine.close();
    this.audioStream.close();
  }

  public void stop() throws IOException {
    this.readfile.interrupt();
    this.filterAudio.interrupt();
    this.output.interrupt();
    this.visualizeData.interrupt();
    this.audioStream.close();
    this.audioLine.close();
    System.out.println("end");
  }
}
