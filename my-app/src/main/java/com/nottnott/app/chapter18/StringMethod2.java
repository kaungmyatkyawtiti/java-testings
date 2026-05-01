package com.nottnott.app.chapter18;

public class StringMethod2 {
  public static void main(String[] args) {
    String str = "hello world world";
    int index = str.indexOf("world");
    System.out.println("Index " + index);

    index = str.lastIndexOf("world");
    System.out.println("Index " + index);

    System.out.println("SubString(3) " + str.substring(3));
    System.out.println("SubString(3, 5) " + str.substring(3, 5));

    System.out.println("replace hello with hi " + str.replaceAll("hello", "hi"));
    System.out.println("Str " + str);

    str = " hello world\r\n ";
    System.out.println("Str.trim " + str.trim());
    System.out.println("Str.strip " + str.strip());

    String str2 = String.valueOf(10);
    String str3 = "" + 20;
    System.out.println("Str2 " + str2);
    System.out.println("Str3 " + str3);
  }
}
