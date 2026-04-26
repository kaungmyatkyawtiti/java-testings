package com.nottnott.app.chapter15;

interface ArithmeticOp {
  int operation(int a, int b);
}

public class FunctionalInterface {
  static int add(int a, int b) {
    return a + b;
  }

  static int sub(int a, int b) {
    return a - b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  static int division(int a, int b) {
    return a / b;
  }

  static void process(ArithmeticOp op, int a, int b) {
    int result = op.operation(a, b);
    System.out.println("Result " + result);
  }

  public static void main(String[] args) {
    ArithmeticOp op = FunctionalInterface::add;
    System.out.println("Add op " + op.operation(1, 2));

    op = FunctionalInterface::sub;
    System.out.println("Sub op " + op.operation(10, 2));

    op = FunctionalInterface::multiply;
    System.out.println("Multiply op " + op.operation(1, 2));

    op = FunctionalInterface::division;
    System.out.println("Division op " + op.operation(10, 2));

    op = (a, b) -> a + b * 2;
    System.out.println("Op " + op.operation(2, 3));

    op = (a, b) -> {
      System.out.println("Expression executed");
      return a + b * 2;
    };
    System.out.println("Op " + op.operation(1, 2));

    process((a, b) -> a + b * 2, 10, 5);
  }
}
