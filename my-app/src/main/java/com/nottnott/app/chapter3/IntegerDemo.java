package com.nottnott.app.chapter3;

public class IntegerDemo {
  public static void main(String[] args) {
    // underflow
    // byte b = -128;
    // b--;

    // overflow
    byte b = 127;
    b++;

    System.out.println("b " + b);
  }
}
