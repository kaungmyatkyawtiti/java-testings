package com.nottnott.app.oopdesign.principle;

class Toyota {
  ToyotaEngine engine = new ToyotaEngine();

  void start() {
    System.out.println("Toyota start");
    this.engine.start();
  }
}

class ToyotaEngine {
  public void start() {
    System.out.println("Toyota engine start");
  }
}

public class TightCoupling {
  public static void main(String[] args) {
    Toyota toyota = new Toyota();
    toyota.start();
  }
}
