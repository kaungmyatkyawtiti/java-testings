package com.nottnott.app.chapter9;

interface MyInterface {
  int getNumber();

  default String getString() {
    return "default string";
  }

  static void hello() {
    System.out.println("hello");
  }
}

class ImpleClass implements MyInterface {
  @Override
  public int getNumber() {
    return 100;
  }
}

public class DefaultDemo {
  public static void main(String[] args) {
    MyInterface myInterface = new ImpleClass();
    System.out.println("number " + myInterface.getNumber());
    System.out.println("string " + myInterface.getString());
    MyInterface.hello();
  }
}
