package com.nottnott.app.chapter18;

public class ImmutableDemo {
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println("str toUpperCase " + str.toUpperCase());
    System.out.println("str " + str);

    str = "";
    double start = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      str += i;
    }
    double end = System.currentTimeMillis();
    double time = end - start;
    System.out.println("Time " + time);
  }
}
