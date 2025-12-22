package com.nottnott.app.chapter4;

public class CompoundAssignment {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    a += b + 2;
    System.out.println("a " + a);

    float f = a;
    // a = f;
    a += f;
  }
}
