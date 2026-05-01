package com.nottnott.app.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    // int[] arr = { 1, 2, 3 };

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(1, 15);
    list.set(4, 70);
    list.remove(1);
    list.remove(Integer.valueOf(1));

    // list.sort((a, b) -> b - a);
    Collections.sort(list);
    for (Integer item : list) {
      System.out.println("item " + item);
    }
    System.out.println("list 1 " + list.get(1));
    System.out.println("IndexOf 300 " + list.indexOf(300));
    System.out.println("IndexOf 700 " + list.indexOf(700));

    Integer[] arr = new Integer[list.size()];
    arr = list.toArray(arr);

    list = List.of(arr);
  }
}
