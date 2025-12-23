package com.nottnott.app.chapter5;

// space 3,star1
// space 2,star2
// space 1,star3
// space 0,star4
// i -> 0, j -> 3, k -> 1;
// i -> 1, j -> 2, k -> 2;
// i -> 2, j -> 1, k -> 3;
// i -> 3, j -> 0, k -> 4;
public class LoopExercise4 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
