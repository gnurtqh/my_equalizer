package tsos.utils;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;

import tsos.common.RingBuffer;

public class FileReader implements Runnable {
  private RingBuffer buffer;
  private AudioInputStream audioInputStream;

  public FileReader(RingBuffer buffer, AudioInputStream audioInputStream) {
    this.buffer = buffer;
    this.audioInputStream = audioInputStream;
  }

  public RingBuffer getBuffer() {
    return this.buffer;
  }

  public static short sample(short byte1, short byte2) {
    if (byte2 >= 0)
      return (short) (byte1 * 128 + byte2 / 2);
    else
      return (short) (byte1 * 128 + (128 - byte2 / 2));
  }

  public void run() {
    int nextByte = 0;
    byte[] byteArray = new byte[1024];

    while (nextByte != -1) {
      try {

        nextByte = this.audioInputStream.read(byteArray);
        for (int i = 0; i < byteArray.length; i += 2) {
          short newSample = sample(byteArray[i + 1], byteArray[i]);
          buffer.write(newSample);
        }
      } catch (IOException e) {
        nextByte = -1;
        e.printStackTrace();
      }
    }
  }
}