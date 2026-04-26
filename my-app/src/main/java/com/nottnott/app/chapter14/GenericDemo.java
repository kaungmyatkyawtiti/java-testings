package com.nottnott.app.chapter14;

import java.util.Date;

class BoxGen<T> {
  T value;

  BoxGen(T value) {
    this.value = value;
  }
}

public class GenericDemo {
  public static void main(String[] args) {
    var box1 = new BoxGen<String>("Hello");
    var box2 = new BoxGen<Date>(new Date());
    String str = box1.value;
    System.out.println("Str toLowerCase " + str.toLowerCase());

    var box3 = new BoxGen<Integer>(10);
    System.out.println("Box3 type " + box3.getClass());
    System.out.println("Instanceof " + (box3 instanceof BoxGen<?>));
  }
}
