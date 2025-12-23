package com.nottnott.app.chapter6;

/**
 * Greeter
 */
public class Greeter {
  void greet(String name) {
    System.out.println("Hello " + name);
  }

  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    greeter.greet("Kaung Myat Kyaw");
    greeter.greet("Nott Nott");
  }
}
