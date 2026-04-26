package com.nottnott.app.chapter13;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter your name");
      String name = scanner.nextLine();

      System.out.println("Enter your age");
      int age = scanner.nextInt();

      System.out.println("Name is " + name + " and age is " + age);
    }
  }
}
