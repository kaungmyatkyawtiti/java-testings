package com.nottnott.app.chapter15;

interface MyFunc {
  int process();
}

public class VariableCapture {
  public static void main(String[] args) {
    int counter = 0;
    MyFunc func = () -> {
      // counter++;
      return counter + 1;
    };
    // counter = 200;
    System.out.println("Func " + func.process());
  }
}
