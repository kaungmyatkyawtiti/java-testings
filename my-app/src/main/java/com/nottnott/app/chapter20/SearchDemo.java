package com.nottnott.app.chapter20;

import java.util.ArrayList;
import java.util.List;

public class SearchDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 5_000_000; i++) {
      list.add(i);
    }
    long start = System.currentTimeMillis();
    int index = list.indexOf(5_000_000);
    long end = System.currentTimeMillis();
    long time = end - start;
    System.out.println("Time " + time);
  }
}
