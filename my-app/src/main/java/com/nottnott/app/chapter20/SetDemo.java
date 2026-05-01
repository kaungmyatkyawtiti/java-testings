package com.nottnott.app.chapter20;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set = new TreeSet<>();
    set.add(1);
    set.add(2);
    set.add(1);

    for (Integer item : set) {
      System.out.println("Item " + item);
    }
  }
}
