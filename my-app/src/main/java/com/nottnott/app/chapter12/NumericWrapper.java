package com.nottnott.app.chapter12;

public class NumericWrapper {
  public static void main(String[] args) {
    Integer i = Integer.valueOf(10);
    System.out.println("Byte " + i.byteValue());
    System.out.println("Int " + i.intValue());
    System.out.println("Long " + i.longValue());

    i = 30;
    System.out.println("Int value " + (i + 1));
  }
}
