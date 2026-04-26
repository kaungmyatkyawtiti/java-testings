package com.nottnott.app.chapter14;

import java.util.ArrayList;

public class CollectionDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);

    for (Integer item : list) {
      System.out.println("Item " + item);
    }

    ArrayList<Object> rawList = new ArrayList<>();
    rawList.add("String");
    rawList.add(12);
  }
}
