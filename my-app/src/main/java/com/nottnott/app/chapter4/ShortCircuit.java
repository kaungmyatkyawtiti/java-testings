package com.nottnott.app.chapter4;

public class ShortCircuit {
  static boolean getTrue() {
    System.out.println("get True");
    return true;
  }

  static boolean getFalse() {
    System.out.println("get False");
    return false;
  }

  public static void main(String[] args) {
    System.out.println("true && true " + (getTrue() && getTrue()));
    System.out.println("true && false " + (getTrue() && getFalse()));
    System.out.println("false && false " + (getFalse() && getFalse()));
    System.out.println("false && true " + (getFalse() && getTrue()));

    System.out.println("true || true " + (getTrue() || getTrue()));
    System.out.println("true || false " + (getTrue() || getFalse()));
    System.out.println("false || false " + (getFalse() || getFalse()));
    System.out.println("false || true " + (getFalse() || getTrue()));

  }
}
