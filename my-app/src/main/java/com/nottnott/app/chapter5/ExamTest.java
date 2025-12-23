package com.nottnott.app.chapter5;

import java.util.Scanner;

public class ExamTest {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter english");
      int eng = scanner.nextInt();

      System.out.println("Enter math");
      int math = scanner.nextInt();

      System.out.println("Enter myanmar");
      int mm = scanner.nextInt();

      boolean isPass = eng >= 40 && math >= 40 && mm >= 40;
      boolean gotDistinction = isPass && (eng >= 80 || math >= 80 || mm >= 80);

      if (gotDistinction) {
        System.out.println("got distinction");
      } else if (isPass) {
        System.out.println("is pass");
      } else {
        System.out.println("is fail");
      }
    }
  }
}
