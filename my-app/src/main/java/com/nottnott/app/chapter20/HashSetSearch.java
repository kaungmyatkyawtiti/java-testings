package com.nottnott.app.chapter20;

import java.util.HashSet;

public class HashSetSearch {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < 5_000_000; i++) {
      set.add(i);
    }
    long start = System.currentTimeMillis();
    boolean contain = set.contains(5_000_000);
    long end = System.currentTimeMillis();
    long time = end - start;
    System.out.println("Time " + time);
  }
}
