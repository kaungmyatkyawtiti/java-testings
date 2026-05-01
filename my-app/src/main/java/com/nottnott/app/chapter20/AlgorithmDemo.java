package com.nottnott.app.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(4);
    list.add(6);
    list.add(2);
    list.add(13);
    Collections.sort(list);
    int index = Collections.binarySearch(list, 6);
    System.out.println("Index " + index);
    Collections.shuffle(list);
    for (Integer item : list) {
      System.out.println("Item " + item);
    }

    int min = Collections.min(list);
    int max = Collections.max(list);
    System.out.println("Min " + min);
    System.out.println("Max " + max);
  }
}
