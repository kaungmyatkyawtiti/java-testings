package com.nottnott.app.chapter8;

// class DieselEngine extends Engine {
//   DieselEngine() {
//     System.out.println("diesel engine constructor");
//   }
//
//   @Override
//   void start() {
//     System.out.println("diesel engine start");
//   }
// }

class GasEngine extends Engine {
  GasEngine() {
    System.out.println("gas engine constructor");
  }

  @Override
  void start() {
    System.out.println("gas engine start");
  }
}

class HighTechGasEngine extends GasEngine {
  HighTechGasEngine() {
    System.out.println("high tech gas engine constructor");
  }

  @Override
  void start() {
    super.start();
    System.out.println("high tech gas engine start");
  }
}

public class CarDemo {
  public static void main(String[] args) {
    Engine engine = new HighTechGasEngine();
    Car car = new Car(engine);
    car.start();
  }
}
