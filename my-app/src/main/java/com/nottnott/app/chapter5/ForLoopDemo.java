package com.nottnott.app.chapter5;

/**
 * ForLoopDemo
 */
public class ForLoopDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("loop " + i);
    }
    System.out.println("end of loop");

    for (int i = 9; i >= 0; i--) {
      System.out.println("reverse loop " + i);
    }

    int total = 0;
    for (int i = 0; i <= 10; i++) {
      total += i;
    }
    System.out.println("total " + total);
  }
}
