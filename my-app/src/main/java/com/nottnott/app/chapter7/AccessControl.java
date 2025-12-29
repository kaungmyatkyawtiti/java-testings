package com.nottnott.app.chapter7;

class Demo {
  public void hello() {
    System.out.println("hello");
  }
}

public class AccessControl {
  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.hello();
  }
}
