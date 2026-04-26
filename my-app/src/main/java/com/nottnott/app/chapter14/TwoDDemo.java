package com.nottnott.app.chapter14;

class TwoD<T extends Number> {
  T x, y;

  TwoD(T x, T y) {
    this.x = x;
    this.y = y;
  }

  long total() {
    return x.intValue() + y.intValue();
  }
}

public class TwoDDemo {
  public static void main(String[] args) {
    TwoD<Integer> obj = new TwoD<>(10, 20);
    TwoD<Long> obj2 = new TwoD<>(10L, 20L);

    System.out.println("Obj total " + obj.total());
    System.out.println("Obj2 total " + obj2.total());
  }
}
