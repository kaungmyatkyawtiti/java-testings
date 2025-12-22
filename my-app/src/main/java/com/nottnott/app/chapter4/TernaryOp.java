package com.nottnott.app.chapter4;

import java.util.Scanner;

public class TernaryOp {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter number");
      int num = scanner.nextInt();

      String result = num % 2 == 0
          ? "even"
          : "odd";
      System.out.println("result is " + result);
    }
  }
}
