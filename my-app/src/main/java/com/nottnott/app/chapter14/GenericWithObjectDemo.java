package com.nottnott.app.chapter14;

class BoxObject {
  Object value;

  BoxObject(Object value) {
    this.value = value;
  }
}

public class GenericWithObjectDemo {
  public static void main(String[] args) {
    BoxObject obj1 = new BoxObject(12);
    BoxObject obj2 = new BoxObject("Hello");

    String str = (String) obj2.value;
    System.out.println("str " + str.toLowerCase());
  }
}
