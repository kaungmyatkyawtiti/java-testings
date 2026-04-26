package com.nottnott.app.chapter12;

public class WrapperProblem {
  public static void main(String[] args) {
    Integer i = Integer.valueOf(127);
    Integer j = Integer.valueOf(127);
    System.out.println("i == j " + (i == j));
    System.out.println("i == j " + (i.intValue() == j.intValue()));

    i = 128;
    j = 128;
    System.out.println("i == j " + (i == j));
    System.out.println("i == j " + (i.intValue() == j.intValue()));

    i = null;
    System.out.println("i == j " + (i == j));
  }
}
