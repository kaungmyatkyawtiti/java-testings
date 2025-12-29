package com.nottnott.app.chapter9;

import java.util.Date;

import com.nottnott.app.chapter8.Car;
import com.nottnott.app.chapter8.DieselEngine;
import com.nottnott.app.chapter8.Engine;

public class PackageDemo {
  public static void main(String[] args) {
    Engine engine = new DieselEngine();
    Car car = new Car(engine);

    car.start();

    Date d = new Date();
    System.out.println("date " + d);
  }
}
