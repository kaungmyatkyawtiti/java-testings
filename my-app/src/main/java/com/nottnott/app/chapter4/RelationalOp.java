package com.nottnott.app.chapter4;

import java.util.Scanner;

public class RelationalOp {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter mark ");

      int mark = scanner.nextInt();
      boolean pass = mark >= 40;
      System.out.println("pass " + pass);
    }

    // System.out.println("false > false " + false > false);
    int a = 10;
    int b = 20;
    System.out.println("a > b " + (a > b));

    double c = 5;
    c = Double.NaN;
    System.out.println("c > b " + (c > b));
    System.out.println("c < b " + (c < b));
    System.out.println("c <= b " + (c <= b));
    System.out.println("c >= b " + (c >= b));

    byte x = 25;
    int y = 25;
    System.out.println("x >= y " + (x >= y));
    System.out.println("x <= y " + (x <= y));
  }
}
