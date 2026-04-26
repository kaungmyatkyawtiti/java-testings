package com.nottnott.app.chapter12;

public class NullCheck {
  public static void checkHumanForNull(Human h) {
    if (h.name == null) {
      System.err.println("Name is null");
    }
    if (h.address == null) {
      System.err.println("Address is null");
    }
  }

  public static void checkDataForNull(Data d) {
    if (d.value == null) {
      System.err.println("Value is null");
    }
  }

  public static void main(String[] args) {
    Human human = new Human();
    Data data = new Data();
    checkHumanForNull(human);
    checkDataForNull(data);
  }
}
