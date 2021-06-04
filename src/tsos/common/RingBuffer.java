package tsos.common;

public class RingBuffer {
  private int length;
  private int size;
  private int writeId;
  private int readId;
  private short[] dataBuffer;

  public RingBuffer(int length) {
    this.length = length;
    this.dataBuffer = new short[length];
    this.size = 0;
    this.writeId = 0;
    this.readId = 0;
  }

  public boolean isFull() {
    return this.size == this.length;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public synchronized void write(short element) {
    while (this.isFull()) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    this.dataBuffer[this.writeId] = element;
    this.writeId = (this.writeId + 1) % this.length;
    this.size++;
    notifyAll();
  }

  public synchronized short read() {
    while (this.isEmpty()) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    short result;
    result = this.dataBuffer[this.readId];
    this.dataBuffer[this.readId] = 0;
    this.readId = (this.readId + 1) % this.length;
    this.size--;
    notifyAll();
    return result;
  }

  public void print() {
    for (int i = 0; i < this.length; i++) {
      System.out.println(this.dataBuffer[i]);
    }
  }
}