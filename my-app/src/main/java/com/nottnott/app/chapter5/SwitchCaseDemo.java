package com.nottnott.app.chapter5;

import java.util.Scanner;

/**
 * SwitchCaseDemo
 */
public class SwitchCaseDemo {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter number");
      int num = scanner.nextInt();

      switch (num) {
        case 0:
          System.out.println("number is 0");
          break;
        case 1:
          System.out.println("number is 1");
          break;
        default:
          System.out.println("others");
      }
    }
  }
}
