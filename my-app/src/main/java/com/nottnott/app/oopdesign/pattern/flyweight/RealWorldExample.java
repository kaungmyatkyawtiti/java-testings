package com.nottnott.app.oopdesign.pattern.flyweight;

public class RealWorldExample {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    System.out.println("str1 == str2 " + (str1 == str2));

    Integer i = 125;
    Integer j = 125;
    System.out.println("i == j " + (i == j));
  }
}
