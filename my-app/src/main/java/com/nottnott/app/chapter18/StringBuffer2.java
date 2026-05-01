package com.nottnott.app.chapter18;

public class StringBuffer2 {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("hello");
    System.out.println("Length " + buffer.length());
    System.out.println("Capacity " + buffer.capacity());

    // for (int i = 0; i < 50; i++) {
    // buffer.append(i);
    // }
    // System.out.println("Length " + buffer.length());
    // System.out.println("Capacity " + buffer.capacity());
    buffer.insert(2, "Java");
    buffer.reverse();
    buffer.delete(0, 2);
    System.out.println("Buffer " + buffer);
  }
}
