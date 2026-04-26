package com.nottnott.app.chapter15;

interface GenOp<T> {
  T getItem(T[] arr, int index);
}

public class GenMethodRef {
  static int getInt(Integer[] arr, int index) {
    return arr[index];
  }

  static String getString(String[] arr, int index) {
    return arr[index];
  }

  public static void main(String[] args) {
    GenOp<Integer> intOp = GenMethodRef::getInt;
    GenOp<String> strOp = GenMethodRef::getString;

    Integer[] arr = { 1, 2, 3 };
    System.out.println("IntOp " + intOp.getItem(arr, 1));
  }
}
