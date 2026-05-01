package com.nottnott.app.chapter19;

public class ToIntDemo {
  public static void main(String[] args) {
    String data = "123 ".trim();
    int intData = Integer.parseInt(data);
    System.out.println("IntData " + intData);

    float floatData = Float.parseFloat(data);
    System.out.println("FloatData " + floatData);

    String str = "တောသားကြီး";
    System.out.println("Str "+ str.length());
  }
}
