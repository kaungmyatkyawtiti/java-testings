package com.nottnott.app.chapter11;

class Task extends Thread {
  String name;

  Task(String name) {
    this.name = name;
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread " + this.name + " i " + i);
    }
  }
}

public class VirtualThreadDemo {
  public static void main(String[] args) {
    Thread th = Thread.ofVirtual().start(new Task("Task 1"));
    try {
      th.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
