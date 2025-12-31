package com.nottnott.app.chapter11;

class Queue {
  int n;
  boolean valueSet = false;

  synchronized public int get() {
    while (!valueSet) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Got n " + n);
    valueSet = false;
    notify();
    return n;
  }

  synchronized public void put(int n) {
    while (valueSet) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    this.n = n;
    valueSet = true;
    notify();
    System.out.println("Put n " + n);
  }
}

class Producer implements Runnable {
  Queue queue;
  Thread thread;

  Producer(Queue queue) {
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

class Consumer implements Runnable {
  Queue queue;
  Thread thread;

  Consumer(Queue queue) {
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

public class CorrectProducerConsumer {
  public static void main(String[] args) {
    Queue queue = new Queue();

    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    producer.start();
    consumer.start();
  }
}
