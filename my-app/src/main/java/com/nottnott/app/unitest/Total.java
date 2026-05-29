package com.nottnott.app.unitest;

public class Total {
  public int sum(int... arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    return total;
  }
}
