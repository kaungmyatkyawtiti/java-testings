package com.nottnott.app.chapter11;

class Printer implements Runnable {
  String name;

  Printer(String name) {
    this.name = name;
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread " + this.name + " i => " + i);
      // try {
      // Thread.sleep(100);
      // } catch (Exception e) {
      // }
    }
  }
}

public class ThreadDemoWithRunnable {
  public static void main(String[] args) {
    int cores = Runtime.getRuntime().availableProcessors();
    System.out.println("CPU " + cores);

    Thread t1 = new Thread(new Printer("One"));
    Thread t2 = new Thread(new Printer("Two"));
    Thread t3 = new Thread(new Printer("Three"));

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      System.out.println("t1 done " + t1.isAlive());

      t2.join();
      System.out.println("t2 done");

      t3.join();
      System.out.println("t3 done");
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Main Thread " + Thread.currentThread().getName());
  }
}
