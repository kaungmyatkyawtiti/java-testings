package com.nottnott.app.chapter10;

public class ChainedException {
  static void process() {
    NullPointerException ne = new NullPointerException("Custom NE");
    ne.initCause(new Exception("Another root cause"));
    throw ne;
  }

  public static void main(String[] args) {
    try {
      process();
    } catch (Exception e) {
      System.out.println("message " + e.getMessage());
      System.out.println("cause " + e.getCause());
    }
  }
}
