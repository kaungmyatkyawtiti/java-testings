package com.nottnott.app.chapter3;

public class TypeInference {
  public static void main(String[] args) {
    int a = 20;
    var b = 20; // literal inference
    // var c;
    var k = a; // expression inference
    var x = k + 2;
  }
}
