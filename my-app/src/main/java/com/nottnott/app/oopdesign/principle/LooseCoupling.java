package com.nottnott.app.oopdesign.principle;

class Car {
  Engine engine;

  Car(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    System.out.println("Car Start");
    this.engine.start();
  }
}

class Engine {
  void start() {
    System.out.println("Engine Start");
  }
}

class DieselEngine extends Engine {
  void start() {
    System.out.println("Diesel engine start");
  }
}

class GasEngine extends Engine {
  void start() {
    System.out.println("Gas engine start");
  }
}

public class LooseCoupling {
  public static void main(String[] args) {
    DieselEngine engine = new DieselEngine();
    Car car = new Car(engine);
    car.start();
  }
}
