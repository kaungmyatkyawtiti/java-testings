package com.nottnott.app.chapter5;

/**
 * ContinueDemo
 */
public class ContinueDemo {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // if(i == 2) continue;
      if (i != 2)
        System.out.println("index " + i);
    }
  }
}
