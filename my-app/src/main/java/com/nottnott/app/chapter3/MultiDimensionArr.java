package com.nottnott.app.chapter3;

public class MultiDimensionArr {

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6, 7 },
        { 9, 11, 13 },
        { 20, 30, 50 }
    };
    System.out.println("matrix length " + matrix.length);
    System.out.println("matrix[1] length " + matrix[1].length);
    System.out.println("matrix[1][2] " + matrix[1][2]);

    matrix[0][2] = 100;
    System.out.println("matrix[0][2] " + matrix[0][2]);
  }
}
