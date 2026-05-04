package com.nottnott.app.chapter21;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter your name");
      String name = scanner.nextLine();

      System.out.println("Enter your age");
      int age = scanner.nextInt();

      System.out.println("Name " + name + " Age " + age);
    }
  }
}
