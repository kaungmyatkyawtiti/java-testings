package com.nottnott.app.chapter9;

class PrivateMethod {
  static void showLength(String str) {
    System.out.println("length " + getLength(str));
  }

  static private int getLength(String str) {
    return str.length();
  }
}

public class PrivateMethodDemo {
  public static void main(String[] args) {
    PrivateMethod.showLength("Nott Nott");
  }
}
