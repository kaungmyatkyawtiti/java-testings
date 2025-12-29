package com.nottnott.app.chapter8;

class Base {
  static void method() {
    System.out.println("base");
  }
}

class Child extends Base {
  static void method() {
    System.out.println("child");
  }
}

public class InvalidPolymorphism {
  public static void main(String[] args) {
    Base b = new Child();
    b.method();
  }
}
