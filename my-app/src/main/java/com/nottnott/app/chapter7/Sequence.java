package com.nottnott.app.chapter7;

public class Sequence {
  void method1() {
    System.out.println("Method 1");
    method2();
    System.out.println("Method 1 returned");
  }

  void method2() {
    System.out.println("Method 2");
    method3();
    System.out.println("Method 2 returned");
  }

  void method3() {
    System.out.println("Method 3");
    System.out.println("Method 3 returned");
  }

  public static void main(String[] args) {
    Sequence s = new Sequence();
    s.method1();
  }
}
