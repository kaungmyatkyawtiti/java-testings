package com.nottnott.app.chapter22;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
  public static void main(String[] args) {
    String str = "Hello World";
    byte[] bytes = str.getBytes();
    ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
    for (int i = 0; i < bytes.length; i++) {
      int data = bin.read();
      if (data != -1) {
        System.out.print((char) data);
      }
    }
    bin.reset();
  }
}
