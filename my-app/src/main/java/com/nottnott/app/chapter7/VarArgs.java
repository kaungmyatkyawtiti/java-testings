package com.nottnott.app.chapter7;

import java.util.ArrayList;

public class VarArgs {
  static int max(int... values) {
    int maxValue = values[0];
    for (int i = 1; i < values.length; i++) {
      if (maxValue < values[i]) {
        maxValue = values[i];
      }
    }
    return maxValue;
  }

  public static void main(String[] args) {
    System.out.println("max value " + max(1, 2, 3, 4));
    System.out.println("max value " + max(2, 4, 6, 8, 10));

    var str = "This is type inference";

    // ArrayList<String> list = new ArrayList<String>();
    var list = new ArrayList<String>();
    list.add("Hello");

    System.out.println("list " + list.get(0));
    System.out.println("size " + list.size());
  }
}
