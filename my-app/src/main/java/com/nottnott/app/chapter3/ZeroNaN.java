package com.nottnott.app.chapter3;

public class ZeroNaN {
  public static void main(String[] args) {
    int zero = 0;

    float pZero = 0.0F;
    float nZero = -0.0F;
    System.out.println(pZero == nZero);
    System.out.println(zero == pZero);
    System.out.println(zero == nZero);

    // System.out.println(1 / zero);
    System.out.println("1 / pZero " + (1 / pZero));
    System.out.println("1 / nZero " + (1 / nZero));

    double result = pZero / pZero;
    System.out.println("pZero/ nZero " + result);
    System.out.println("NaN == NaN " + (result == result));
    System.out.println("isNaN " + (Double.isNaN(result)));
  }
}
