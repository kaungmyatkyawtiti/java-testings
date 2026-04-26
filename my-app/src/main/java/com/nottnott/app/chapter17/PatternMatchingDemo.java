package com.nottnott.app.chapter17;

public class PatternMatchingDemo {
  public static void main(String[] args) {
    Number num = Float.valueOf(2);

    if (num instanceof Integer) {
      System.out.println("Number is Integer");
    } else if (num instanceof Float f) {
      System.out.println("Number is Float");
      // Float f = (Float) num;
      System.out.println("F " + f);
    }

    Object[] list = {
        "Alpha",
        "Beta",
        "Theta",
        Integer.valueOf(100),
        "Gamma"
    };
    for (int i = 0; (list[i] instanceof String str) && i < list.length; i++) {
      System.out.println("Str " + str);
    }
  }
}
