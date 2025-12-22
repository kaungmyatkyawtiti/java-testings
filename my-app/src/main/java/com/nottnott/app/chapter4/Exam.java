package com.nottnott.app.chapter4;

import java.util.Scanner;

public class Exam {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter english");
      int eng = scanner.nextInt();

      System.out.println("Enter math");
      int math = scanner.nextInt();

      System.out.println("Enter myanmar");
      int mm = scanner.nextInt();

      boolean isPass = eng >= 40 && math >= 40 && mm >= 40;
      System.out.println("isPass " + isPass);

      boolean gotDistinction = isPass && (eng >= 80 || math >= 80 || mm >= 80);
      System.out.println("gotDistinction " + gotDistinction);
    }
  }
}
