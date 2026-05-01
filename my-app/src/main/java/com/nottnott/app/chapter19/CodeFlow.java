package com.nottnott.app.chapter19;

public class CodeFlow {
  static void method2() {
    System.out.println("Method 2");
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    for (StackTraceElement el : elements) {
      System.out
          .println("Ele " + el.getClassName() + " method " + el.getMethodName() + " line no " + el.getLineNumber());
    }
  }

  static void method3() {
    System.out.println("Method 3");
    method2();
  }

  static void method1() {
    System.out.println("Method 1");
    method2();
  }

  public static void main(String[] args) {
    method1();
    method3();
  }
}
