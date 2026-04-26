package com.nottnott.app.chapter29;

import java.util.concurrent.Semaphore;

class Queue {
  int n;
  static Semaphore semaCon = new Semaphore(0);
  static Semaphore semaProd = new Semaphore(1);

  public void get() {
    try {
      semaCon.acquire();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Got n " + n);
    semaProd.release();
  }

  public void put(int n) {
    try {
      semaProd.acquire();
    } catch (Exception e) {
      e.printStackTrace();
    }
    this.n = n;
    System.out.println("Put n " + n);
    semaCon.release();
  }
}

class Producer extends Thread {
  Queue queue;

  Producer(Queue queue) {
    this.queue = queue;
  }

  public void run() {
    for (int i = 0; i < 20; i++) {
      this.queue.put(i);
    }
  }
}

class Consumer extends Thread {
  Queue queue;

  Consumer(Queue queue) {
    this.queue = queue;
  }

  public void run() {
    for (int i = 0; i < 20; i++) {
      this.queue.get();
    }
  }
}

public class ProducerConsumer {
  public static void main(String[] args) {
    Queue queue = new Queue();
    Producer prod = new Producer(queue);
    Consumer con = new Consumer(queue);

    prod.start();
    con.start();
  }
}
