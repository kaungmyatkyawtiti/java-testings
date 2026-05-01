package com.nottnott.app.chapter18;

public class StringMethod3 {
  public static void main(String[] args) {
    String str = "hello world";
    System.out.println("Str toUpperCase " + str.toUpperCase());
    System.out.println("Str toLowerCase " + str.toLowerCase());
    System.out.println("Str " + str);

    String str2 = String.join(";", "Hello", "World");
    System.out.println("Str2 " + str2);

    String[] arr = str2.split(";");
    for (String item : arr) {
      System.out.println("Item " + item);
    }
  }
}
