package com.nottnott.app.chapter4;

public class ArithmeticDemo {

  public static void main(String[] args) {
    int a = 5;
    int b = 2;
    // int c = true + a;
    System.out.println("a + b " + (a + b));
    System.out.println("a - b " + (a - b));
    System.out.println("a * b " + (a * b));
    System.out.println("a / b " + (a / b));
    System.out.println("a / 2.0F " + (a / 2.0F));
    System.out.println("a % b " + (a % b));

    System.out.println("+a " + (+a));

    int c = a++;
    System.out.println("c " + c);
    System.out.println("a " + a);
    // System.out.println("c " + c)
  }
}
