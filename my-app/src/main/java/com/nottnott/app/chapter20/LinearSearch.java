package com.nottnott.app.chapter20;

public class LinearSearch {
  public static int search(int[] arr, int item) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == item) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 2, 5, 6, 22 };
    System.out.println("Search 3 " + search(arr, 3));
    System.out.println("Search 5 " + search(arr, 5));
  }
}
