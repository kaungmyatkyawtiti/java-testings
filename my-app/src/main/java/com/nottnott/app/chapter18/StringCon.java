package com.nottnott.app.chapter18;

public class StringCon {
  public static void main(String[] args) {
    byte[] bytes = { 66, 67, 68, 69 };
    String str = new String(bytes);
    System.out.println("Str " + str);
    str.getBytes();
  }
}
