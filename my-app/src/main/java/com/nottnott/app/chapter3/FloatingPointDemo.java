package com.nottnott.app.chapter3;

import java.math.BigDecimal;

public class FloatingPointDemo {
  public static void main(String[] args) {
    float f = 2.14F;
    double d = 2.14;
    System.out.println("Float " + f + " Double " + d);

    float a = 0.3F;
    float b = 0.2F;
    float c = a - b;
    System.out.println("c " + c);

    double x = 0.3;
    double y = 0.2;
    double z = x - y;
    System.out.println("z " + z);

    double q = 0.4F;
    System.out.println("q " + q);

    BigDecimal bdA = new BigDecimal("0.3");
    BigDecimal bdB = new BigDecimal("0.2");
    BigDecimal result = bdA.subtract(bdB);
    System.out.println("result " + result.toString());
  }
}
