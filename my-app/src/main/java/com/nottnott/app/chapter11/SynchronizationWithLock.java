package com.nottnott.app.chapter11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Data {
  int value = 0;
}

class IncThread extends Thread {
  Data data;
  Lock lock;

  IncThread(Data data, Lock lock) {
    this.data = data;
    this.lock = lock;
  }

  public void run() {
    for (int i = 0; i < 100_000; i++) {
      this.lock.lock();

      data.value++;

      // this.lock.unlock();
    }
  }
}

public class SynchronizationWithLock {
  public static void main(String[] args) {
    Data data = new Data();
    Lock lock = new ReentrantLock();

    IncThread t1 = new IncThread(data, lock);
    IncThread t2 = new IncThread(data, lock);
    IncThread t3 = new IncThread(data, lock);

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
