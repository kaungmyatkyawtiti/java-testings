package com.nottnott.app.chapter20;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  public static void main(String[] args) {
    SortedSet<Integer> set;
    set = new TreeSet<>();
    set.add(1);
    set.add(4);
    set.add(3);
    set.add(2);

    for (Integer item : set) {
      System.out.println("Item " + item);
    }
    System.out.println("Contains 1 " + set.contains(1));
  }
}
