package com.nottnott.app.chapter22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class WriteWithBufferOutputDemo {
  public static void main(String[] args) {
    File file = new File("./demo.txt");

    try (var bout = new BufferedOutputStream(new FileOutputStream(file))) {
      char ch = 'A';
      for (int i = 0; i < 50; i++) {
        bout.write(ch);
        ch++;
      }
      bout.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
