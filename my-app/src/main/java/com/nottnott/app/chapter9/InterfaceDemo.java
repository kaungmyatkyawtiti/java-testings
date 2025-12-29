package com.nottnott.app.chapter9;

class Bird implements Flyable {
  @Override
  public void fly() {
    System.out.println("Bird fly");
  }
}

class Airplane implements Flyable {
  @Override
  public void fly() {
    System.out.println("Airplane fly");
  }
}

public class InterfaceDemo {
  public static void main(String[] args) {
    Flyable f = new Bird();
    f.fly();

    f = new Airplane();
    f.fly();

    // f.SIZE++;
    System.out.println("f.SIZE " + f.SIZE);
  }
}
