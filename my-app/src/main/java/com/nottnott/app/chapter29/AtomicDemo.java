package com.nottnott.app.chapter29;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

class AtomicData {
  AtomicInteger value = new AtomicInteger();
}

class IncThreadWithAtomic extends Thread {
  Lock lock;
  AtomicData data;

  IncThreadWithAtomic(AtomicData data) {
    this.data = data;
  }

  public void run() {
    for (int i = 0; i < 100000; i++) {
      this.data.value.getAndIncrement();
    }
  }
}

public class AtomicDemo {
  public static void main(String[] args) {
    AtomicData data = new AtomicData();

    IncThreadWithAtomic t1 = new IncThreadWithAtomic(data);
    IncThreadWithAtomic t2 = new IncThreadWithAtomic(data);
    IncThreadWithAtomic t3 = new IncThreadWithAtomic(data);

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
