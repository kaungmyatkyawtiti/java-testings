package com.nottnott.app.chapter4;

public class LogicalOpDemo {
  public static void main(String[] args) {
    boolean isRaining = false;
    boolean toGo = true;
    if (isRaining && toGo) {
      System.out.println("Take umbrella");
    } else {
      System.out.println("Don't take umbrella");
    }

    System.out.println("true && false " + (true && false));
    System.out.println("true && true " + (true && true));
    System.out.println("false && false " + (false && false));
    System.out.println("false && false " + (false && true));

    System.out.println("true || false " + (true || false));
    System.out.println("true || true " + (true || true));
    System.out.println("false || false " + (false || false));
    System.out.println("false || true " + (false || true));

    System.out.println("!false " + (!false));
    System.out.println("!true " + (!true));
  }
}
