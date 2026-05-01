package com.nottnott.app.chapter18;

public class StringBufferDemo {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer();
    double start = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      buffer.append(i);
    }
    double end = System.currentTimeMillis();
    double time = end - start;
    System.out.println("Time " + time);
  }
}
