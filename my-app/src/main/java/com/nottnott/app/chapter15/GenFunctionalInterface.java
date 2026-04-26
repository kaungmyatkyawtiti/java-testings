package com.nottnott.app.chapter15;

interface Op<T> {
  T operation(T a, T b);
}

public class GenFunctionalInterface {
  static int add(int a, int b) {
    System.out.println("Int add");
    return a + b;
  }

  static float add(float a, float b) {
    System.out.println("Float add");
    return a - b;
  }

  static Op<Integer> getFun() {
    return GenFunctionalInterface::add;
  }

  public static void main(String[] args) {
    Op<Integer> op = GenFunctionalInterface::add;
    System.out.println("Op " + op.operation(10, 2));

    Op<Float> op2 = GenFunctionalInterface::add;
    System.out.println("Op2 " + op2.operation(10F, 2F));

    System.out.println("GetFun " + getFun().operation(10, 2));
  }
}
