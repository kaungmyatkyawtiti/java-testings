package com.nottnott.app.chapter15;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

public class PredefinedFunInterface {
  static int next(int a) {
    return a + 1;
  }

  static int add(int a, int b) {
    return a + b;
  }

  static int sub(int a, int b) {
    return a - b;
  }

  static int mult(int a, int b) {
    return a * b;
  }

  static int div(int a, int b) {
    return a / b;
  }

  static void print(int a) {
    System.out.println("A is " + a);
  }

  static int getTen() {
    return 10;
  }

  static Integer getLength(String str) {
    return str.length();
  }

  static boolean isEven(int n) {
    return n % 2 == 0;
  }

  public static void main(String[] args) {
    BinaryOperator<Integer> op = PredefinedFunInterface::add;
    System.out.println("Op " + op.apply(1, 2));

    UnaryOperator<Integer> unary = PredefinedFunInterface::next;
    System.out.println("Unary " + unary.apply(10));

    Consumer<Integer> consumer = PredefinedFunInterface::print;
    consumer.accept(20);

    Supplier<Integer> supplier = PredefinedFunInterface::getTen;
    System.out.println("Supplier " + supplier.get());

    Function<String, Integer> function = PredefinedFunInterface::getLength;
    System.out.println("Function " + function.apply("hello"));

    Predicate<Integer> pred = PredefinedFunInterface::isEven;
    System.out.println("Predicate " + pred.test(10));
  }
}
