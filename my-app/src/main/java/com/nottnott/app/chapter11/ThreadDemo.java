package com.nottnott.app.chapter11;

class PrintThread extends Thread {
  String name;

  PrintThread(String name) {
    this.name = name;
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread " + this.name + " i => " + i);
    }
  }
}

public class ThreadDemo {
  public static void main(String[] args) {
    int cores = Runtime.getRuntime().availableProcessors();
    System.out.println("CPU " + cores);

    PrintThread t1 = new PrintThread("One");
    PrintThread t2 = new PrintThread("Two");
    PrintThread t3 = new PrintThread("Three");

    t1.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();

    System.out.println("Main Thread " + Thread.currentThread().getName());
  }
}
