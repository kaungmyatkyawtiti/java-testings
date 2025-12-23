package com.nottnott.app.chapter5;

/**
 * ArrLoopDemo
 */
public class ArrLoopDemo {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("arr[%d] %d%n", i, arr[i]);
    }

    int[][] matrix = {
        { 1, 2, 3, 4, 5 },
        { 10, 20, 30, 40, 50 },
        { 24, 98, 34 }
    };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.println("matrix [" + i + "][" + j + "] " + matrix[i][j]);
      }
    }
  }
}
