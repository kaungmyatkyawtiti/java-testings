package com.nottnott.app.chapter5;

/**
 * ForEachDemo
 */
public class ForEachDemo {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr [" + i + "] " + arr[i]);
      arr[i] = arr[i] * 2;
      System.out.println("arr [" + i + "] " + arr[i]);
    }

    for (final int val : arr) {
      System.out.println(val);
    }
  }
}
