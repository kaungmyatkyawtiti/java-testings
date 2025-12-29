package com.nottnott.app.chapter7;

class Box {
  int value;
  static int count;

  static {
    System.out.println("static initializer 1");
  }

  static {
    System.out.println("static initializer 2");
  }

  public Box(int value) {
    this.value = value;
    Box.count++;
  }

  static void hello() {
    System.out.println("hello");
  }

  static void another() {
    System.out.println("another");
    // normal();
  }

  void normal() {
    System.out.println("Non static");
    hello();
  }
}

public class StaticDemo {
  public static void main(String[] args) {
    Box obj = new Box(100);
    Box obj2 = new Box(200);

    obj.value++;
    System.out.println("obj " + obj.value);
    System.out.println("obj2 " + obj2.value);

    System.out.println("obj.count " + obj.count);
    System.out.println("obj2.count " + obj2.count);

    System.out.println("Box.count " + Box.count);

    obj.normal();
    Box.another();
  }
}
