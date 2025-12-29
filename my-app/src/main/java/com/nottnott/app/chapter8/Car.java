package com.nottnott.app.chapter8;

public class Car {
  Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    System.out.println("car start");
    this.engine.start();
  }
}
