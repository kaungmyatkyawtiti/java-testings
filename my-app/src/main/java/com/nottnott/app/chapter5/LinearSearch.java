package com.nottnott.app.chapter5;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 8 };
    int num = 3;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        System.out.println("found index at " + i);
        break;
      }
      System.out.println("loop " + i);
    }
  }
}
