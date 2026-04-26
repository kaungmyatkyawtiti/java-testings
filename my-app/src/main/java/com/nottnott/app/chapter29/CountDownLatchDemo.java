package com.nottnott.app.chapter29;

import java.util.concurrent.CountDownLatch;

class MyThread extends Thread {
  CountDownLatch cdLatch;

  MyThread(CountDownLatch cdLatch) {
    this.cdLatch = cdLatch;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("i " + i);
      this.cdLatch.countDown();
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class CountDownLatchDemo {
  public static void main(String[] args) {
    CountDownLatch cdLatch = new CountDownLatch(5);
    System.out.println("Starting");

    MyThread th = new MyThread(cdLatch);
    th.start();

    try {
      cdLatch.await();
      System.out.println("Done");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
