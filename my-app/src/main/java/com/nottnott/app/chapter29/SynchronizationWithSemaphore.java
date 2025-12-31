package com.nottnott.app.chapter29;

import java.util.concurrent.Semaphore;

class Data {
  int value = 0;
}

class IncThread extends Thread {
  Data data;
  Semaphore semaphore;

  IncThread(Data data, Semaphore semaphore) {
    this.data = data;
    this.semaphore = semaphore;
  }

  public void run() {
    for (int i = 0; i < 100_000; i++) {
      try {
        this.semaphore.acquire();
        data.value++;

        this.semaphore.release();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class SynchronizationWithSemaphore {
  public static void main(String[] args) {
    Data data = new Data();
    Semaphore sem = new Semaphore(1);

    IncThread t1 = new IncThread(data, sem);
    IncThread t2 = new IncThread(data, sem);
    IncThread t3 = new IncThread(data, sem);

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      System.out.println("Data " + data.value);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
