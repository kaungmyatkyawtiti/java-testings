package com.nottnott.app.chapter7;

/**
 * OverLoadDemo
 */
public class OverLoadDemo {
  static void print(short a) {
    System.out.println("short version " + a);
  }

  static void print(int a) {
    System.out.println("int version " + a);
  }

  static void print(long a) {
    System.out.println("long version " + a);
  }

  // static int print(long a) {
  // }

  public static void main(String[] args) {
    byte b = 10;
    print(b);
  }
}
