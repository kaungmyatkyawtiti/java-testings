package com.nottnott.app.chapter29;

import java.util.concurrent.Phaser;

class PartyThread extends Thread {
  Phaser phaser;
  String name;

  PartyThread(Phaser phaser, String name) {
    this.phaser = phaser;
    this.name = name;

    this.phaser.register();
  }

  public void run() {
    System.out.println("Thread " + this.name + " beginning phase 1");
    this.phaser.arriveAndAwaitAdvance();

    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Thread " + this.name + " beginning phase 2");
    this.phaser.arriveAndAwaitAdvance();

    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Thread " + this.name + " beginning phase 3");
    this.phaser.arriveAndDeregister();
  }
}

public class PhaserDemo {
  public static void main(String[] args) {
    Phaser phaser = new Phaser(1);
    int currentPhase;

    PartyThread t1 = new PartyThread(phaser, "One");
    PartyThread t2 = new PartyThread(phaser, "Two");
    PartyThread t3 = new PartyThread(phaser, "Three");

    t1.start();
    t2.start();
    t3.start();

    currentPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + currentPhase + " completed");

    currentPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + currentPhase + " completed");

    currentPhase = phaser.getPhase();
    phaser.arriveAndAwaitAdvance();
    System.out.println("Phase " + currentPhase + " completed");

    phaser.arriveAndDeregister();
    if (phaser.isTerminated()) {
      System.out.println("Terminated");
    }
  }
}
