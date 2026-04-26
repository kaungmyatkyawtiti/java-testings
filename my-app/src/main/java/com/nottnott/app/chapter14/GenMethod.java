package com.nottnott.app.chapter14;

public class GenMethod {
  static <T extends Number> boolean isGt(T value1, T value2) {
    return value1.longValue() > value2.longValue();
  }

  public static void main(String[] args) {
    Integer a = 10;
    Float b = 5.0f;
    System.out.println("isGt " + isGt(a, b));
  }
}
