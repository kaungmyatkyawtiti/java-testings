package com.nottnott.app.chapter30;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Integer arr[] = { 1, 2, 3, 4, 5 };
    Stream<Integer> stream = Arrays.stream(arr);

    Function<Integer, Integer> toDouble = n -> n * 2;
    Stream<Integer> result = stream.map(toDouble);

    result.forEach(System.out::println);
  }
}
