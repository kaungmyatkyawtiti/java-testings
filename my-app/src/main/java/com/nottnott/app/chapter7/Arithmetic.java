package com.nottnott.app.chapter7;

public class Arithmetic {
  int add(int a, int b) {
    return a + b;
  }

  float add(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    Arithmetic arithmetic = new Arithmetic();
    int result = arithmetic.add(10, 20);
    System.out.println("result " + result);

    float result2 = arithmetic.add(10.5F, 20.5F);
    System.out.println("result2 " + result2);
  }
}
