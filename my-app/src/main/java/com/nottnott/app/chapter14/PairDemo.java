package com.nottnott.app.chapter14;

class Pair<T, U> {
  T first;
  U second;

  Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return this.first;
  }

  public U getSecond() {
    return this.second;
  }
}

public class PairDemo {
  static Pair<Integer, String> getSomething() {
    return new Pair<>(10, "Hello");
  }

  public static void main(String[] args) {
    Pair<Integer, String> data = getSomething();
    System.out.println("Data first " + data.first);
  }
}
