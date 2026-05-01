package com.nottnott.app.chapter21;

import java.util.Optional;

public class OptionalDemo {
  public static String toUpper(String str) {
    return str.toUpperCase();
  }

  public static String appendHi(String str) {
    return str + " Hi";
  }

  public static void main(String[] args) {
    // String data = null;
    // String result = toUpper(data);
    // result = appendHi(result);
    // System.out.println("Result " + result);

    // String data = "hello world";
    String data = null;
    String result = Optional.ofNullable(data)
        .map(OptionalDemo::toUpper)
        .map(OptionalDemo::appendHi)
        .orElse("default String");
    System.out.println("Result " + result);
  }
}
