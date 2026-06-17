package com.nottnott.app.oopdesign.pattern.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IteratorDemo {
  public static void main(String[] args) {
    // List<String> strList = new ArrayList<>();
    // strList.add("One");
    // strList.add("Two");
    //
    // for (String item : strList) {
    // System.out.println("Item " + item);
    // }
    //
    // HashSet<String> hashList = new HashSet<>();
    // hashList.add("Item 1");
    // hashList.add("Item 2");
    // hashList.add("Item 3");
    // for (String item : hashList) {
    // System.out.println("Item " + item);
    // }

    WordIterator wordIterator = new WordIterator("Hello world with java");
    Iterator<String> iterator = wordIterator.createIterator();
    while (iterator.hasMore()) {
      System.out.println("Item " + iterator.next());
    }

    WordArrayIterator wordArrIterator = new WordArrayIterator(new String[] {
        "Hello",
        "Hi"
    });
    Iterator<String> iterator2 = wordArrIterator.createIterator();
    while (iterator2.hasMore()) {
      System.out.println("Item " + iterator2.next());
    }
  }
}
