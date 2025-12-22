package com.nottnott.app.chapter3;

public class TypeConvention {
  public static void main(String[] args) {
    int a = 20;
    long lg = 120;
    float f = 20;
    // a = lg;
    // f = lg;
    // lg = f;

    short sh = 129;
    byte b = 20;
    // sh = b;
    b = (byte) sh;
    System.out.println("b " + b);
  }
}
