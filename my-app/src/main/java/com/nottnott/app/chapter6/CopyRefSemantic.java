package com.nottnott.app.chapter6;

class Data {
  int value;

  @Override
  public String toString() {
    return "Data value: " + value;
  }
}

public class CopyRefSemantic {
  public static void main(String[] args) {
    Data obj = new Data();
    obj.value = 100;

    Data obj2 = new Data();
    obj2.value = 200;

    System.out.println("obj " + obj);
    System.out.println("obj2 " + obj2);

    int a = 10;
    int b;
    b = a; // copy
    a++;
    System.out.println("a " + a + " b " + b);

    obj = obj2;
    obj.value = 300;
    System.out.println("obj " + obj + " obj2 " + obj2);

    obj2 = new Data();
    obj.value = 400;
    System.out.println("obj " + obj + " obj2 " + obj2);
  }
}
