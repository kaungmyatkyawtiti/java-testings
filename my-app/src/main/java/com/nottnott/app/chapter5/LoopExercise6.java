package com.nottnott.app.chapter5;

// space 3, star1 
// space 2, star3
// space 1, star5
// space 0, star7
// i -> 0, j -> 3, k -> 1;
// i -> 1, j -> 2, k -> 3;
// i -> 2, j -> 1, k -> 5;
// i -> 3, j -> 0, k -> 7;
public class LoopExercise6 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (i * 2) + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
