package com.nottnott.app.chapter7;

class Outer {
  int outerValue = 10;

  void method() {
    Inner inner = new Inner();
    inner.innerMethod();
    System.out.println("outer value " + this.outerValue);
  }

  class Inner {
    int innerValue;

    void innerMethod() {
      outerValue++;
      System.out.println("inner method");
    }
  }
}

public class InnerClassDemo {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.method();
  }
}
