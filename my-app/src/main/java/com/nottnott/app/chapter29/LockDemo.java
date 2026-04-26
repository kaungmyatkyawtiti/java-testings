package com.nottnott.app.chapter29;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Box {
  int value;
}

class IncreaseThread extends Thread {
  Lock lock;
  Box data;

  IncreaseThread(Lock lock, Box data) {
    this.lock = lock;
    this.data = data;
  }

  public void run() {
    for (int i = 0; i < 100000; i++) {
      this.lock.lock();

      this.data.value++;

      this.lock.unlock();
    }
  }
}

public class LockDemo {
  public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    Box data = new Box();

    IncreaseThread t1 = new IncreaseThread(lock, data);
    IncreaseThread t2 = new IncreaseThread(lock, data);
    IncreaseThread t3 = new IncreaseThread(lock, data);

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      System.out.println("Data value " + data.value);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
