package com.nottnott.app.chapter20;

import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int[] arr2 = { 1, 2, 3 };
    System.out.println("Array.equals " + Arrays.equals(arr, arr2));
    int[] arr3 = { 4, 5, 6, 7 };
    int[] arr4 = new int[3];
    Arrays.fill(arr4, 10);
    for (int item : arr4) {
      System.out.println("Item " + item);
    }
    arr4 = Arrays.copyOf(arr3, 4);
    for (int item : arr4) {
      System.out.println("Item " + item);
    }
  }
}
