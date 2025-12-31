package com.nottnott.app.chapter29;

import java.util.concurrent.Semaphore;

class PrinterThread extends Thread {
  String name;
  Semaphore sem;

  PrinterThread(String name, Semaphore sem) {
    this.name = name;
    this.sem = sem;
  }

  public void run() {
    for (int i = 0; i < 1000; i++) {
      try {
        this.sem.acquire();
        Thread.sleep(1500);
        System.out.println("Thread " + this.name + " => " + i);
        this.sem.release();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class SemaphoreDemo {
  public static void main(String[] args) {
    Semaphore sem = new Semaphore(2);

    PrinterThread t1 = new PrinterThread("One", sem);
    PrinterThread t2 = new PrinterThread("Two", sem);
    PrinterThread t3 = new PrinterThread("Three", sem);
    PrinterThread t4 = new PrinterThread("Four", sem);
    PrinterThread t5 = new PrinterThread("Five", sem);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      t4.join();
      t5.join();
      System.out.println("Done");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
