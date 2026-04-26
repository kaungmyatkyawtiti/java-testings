package com.nottnott.app.chapter11;

class SampleQueue {
  int n;

  synchronized public int get() {
    System.out.println("Got n " + n);
    return n;
  }

  synchronized public void put(int n) {
    this.n = n;
    System.out.println("Put n " + n);
  }
}

class SampleProducer implements Runnable {
  SampleQueue queue;
  Thread thread;

  SampleProducer(SampleQueue queue) {
    this.queue = queue;
    this.thread = new Thread(this, "Producer");
  }

  @Override
  public void run() {
    int i = 0;
    while (true) {
      this.queue.put(i++);
    }
  }

  void start() {
    this.thread.start();
  }
}

class SampleConsumer implements Runnable {
  SampleQueue queue;
  Thread thread;

  SampleConsumer(SampleQueue queue) {
    this.queue = queue;
    this.thread = new Thread(this, "Consumer");
  }

  @Override
  public void run() {
    while (true) {
      this.queue.get();
    }
  }

  void start() {
    this.thread.start();
  }
}

public class IncorrectProducerConsumer {
  public static void main(String[] args) {
    SampleQueue queue = new SampleQueue();

    SampleProducer producer = new SampleProducer(queue);
    SampleConsumer consumer = new SampleConsumer(queue);

    producer.start();
    consumer.start();
  }
}
