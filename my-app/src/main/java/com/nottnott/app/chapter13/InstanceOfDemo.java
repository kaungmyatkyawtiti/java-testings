package com.nottnott.app.chapter13;

class Parent {

}

class Child extends Parent {

}

public class InstanceOfDemo {
  public static void main(String[] args) {
    Child child = new Child();
    System.out.println("child instanceof Child " + (child instanceof Child));
    System.out.println("child instanceof Parent " + (child instanceof Parent));
    System.out.println("child instanceof Object " + (child instanceof Object));

    Object ch = child;
    System.out.println("ch instanceof String " + (ch instanceof String));
  }
}
