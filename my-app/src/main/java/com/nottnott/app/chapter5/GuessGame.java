package com.nottnott.app.chapter5;

import java.util.Random;

import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args) {
    Random random = new Random();

    int num = random.nextInt(10);
    // System.out.println("random num " + num);

    try (Scanner scanner = new Scanner(System.in)) {
      int guess;
      do {
        System.out.println("Guess");
        guess = scanner.nextInt();

        if (num > guess)
          System.out.println("too small");
        else if (num < guess)
          System.out.println("too large");

      } while (num != guess);
    }

    System.out.println("correct");
  }
}
