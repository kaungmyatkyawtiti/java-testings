package com.nottnott.app.chapter30;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(50);

    Stream<Integer> stream = list.stream();
    Spliterator<Integer> spliterator = stream.spliterator();
    while (spliterator.tryAdvance(n -> System.out.println("N " + n)))
      ;
  }
}
