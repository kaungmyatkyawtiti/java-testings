package com.nottnott.app.chapter5;

/**
 * format
 ****
 ***
 **
 *
 */
// i -> 0, j -> < 4;
// i -> 1, j -> < 3;
// i -> 2, j -> < 2;
// i -> 3, j -> < 1;
public class LoopExercise3 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
