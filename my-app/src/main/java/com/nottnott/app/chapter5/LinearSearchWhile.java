package com.nottnott.app.chapter5;

public class LinearSearchWhile {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 8 };
    int num = 3;

    int i = 0;
    boolean found = false;
    while (i < arr.length && !found) {
      i++;
      if (arr[i] == num) {
        System.out.println("found index at " + i);
        found = true;
      }
    }
  }
}
