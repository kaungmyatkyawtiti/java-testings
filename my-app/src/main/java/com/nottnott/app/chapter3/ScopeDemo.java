package com.nottnott.app.chapter3;

public class ScopeDemo {
  public static void main(String[] args) {
    int c = 40;
    {
      int a = 20;
      System.out.println("c" + c);
    }
    String a = "Hello";
    System.out.println("c" + c);
    System.out.println("a" + a);
  }
}
