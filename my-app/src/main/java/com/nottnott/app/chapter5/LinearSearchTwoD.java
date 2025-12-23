package com.nottnott.app.chapter5;

/**
 * LinearSearchTwoD
 */
public class LinearSearchTwoD {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4, 5 },
        { 6, 8, 9, 10 },
        { 11, 12, 13, 14 }
    };
    int num = 13;

    outer: for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == num) {
          System.out.println("found at index i " + i + " and index j " + j);
          break outer;
        }
        System.out.println("loop j " + j);
      }
      System.out.println("loop i " + i);
    }
  }
}
