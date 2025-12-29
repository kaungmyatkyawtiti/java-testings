package com.nottnott.app.chapter7;

/**
 * Data
 */
public class Data {
  int value;

  Data(int value) {
    this.value = value;
  }

  static void process(int a) {
    a++;
  }

  static void process(Data data) {
    data.value++;
  }

  static void process2(Data data) {
    data = new Data(500);
  }

  public static void main(String[] args) {
    Data obj = new Data(100);
    Data obj2 = new Data(100);
    System.out.println("obj == obj2 " + (obj == obj2));

    process(obj);
    System.out.println("obj.value " + obj.value);
    process2(obj);
    System.out.println("obj.value " + obj.value);

    int item = 10;
    process(item);
    System.out.println("item " + item);
  }
}
