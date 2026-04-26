package com.nottnott.app.chapter14;

class NumberBox<T extends Number> {
  T value;

  NumberBox(T value) {
    this.value = value;
  }

  boolean isGreaterThan(NumberBox<?> another) {
    return this.value.longValue() > another.value.longValue();
  }
}

public class WildCardDemo {
  public static void main(String[] args) {
    NumberBox<Double> box1 = new NumberBox<>(10.0);
    NumberBox<Integer> box2 = new NumberBox<>(6);
    NumberBox<Double> box3 = new NumberBox<>(6.0);

    System.out.println("Box 1 is greater than box 3 " + box1.isGreaterThan(box3));
    System.out.println("Box 1 is greater than box 2 " + box1.isGreaterThan(box2));
  }
}
