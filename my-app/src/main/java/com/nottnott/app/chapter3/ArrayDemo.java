package com.nottnott.app.chapter3;

public class ArrayDemo {
  public static void main(String[] args) {
    int totalAge = 0;
    int[] ages = { 10, 20, 30, 40, 50 };
    System.out.println("ages " + ages[0]);
    System.out.println("ages.length " + ages.length);
    // System.out.println("age[5] " + age[5]);

    for (int i = 0; i < ages.length; i++) {
      totalAge += ages[i];
    }
    System.out.println("totalAge " + totalAge);
  }
}
