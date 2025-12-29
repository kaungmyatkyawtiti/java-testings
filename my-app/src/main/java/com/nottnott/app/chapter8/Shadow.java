package com.nottnott.app.chapter8;

class ParentBase {
  int x;

  void method() {
    System.out.println("ParentBase method");
    this.another();
  }

  void another() {
    System.out.println("ParentBase another");
  }
}

class ChildX extends ParentBase {
  int x;

  ChildX(int x) {
    this.x = x;
  }

  void another() {
    System.out.println("ChildX another");
  }
}

public class Shadow {
  public static void main(String[] args) {
    ParentBase b = new ChildX(10);
    System.out.println("b.x " + b.x);

    b.method();
  }
}
