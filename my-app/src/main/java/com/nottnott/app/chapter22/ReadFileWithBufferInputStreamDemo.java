package com.nottnott.app.chapter22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadFileWithBufferInputStreamDemo {
  public static void main(String[] args) {
    File file = new File("src/main/java/com/nottnott/app/chapter21/TimerDemo.java");

    try (var bin = new BufferedInputStream(new FileInputStream(file))) {
      int ch;
      bin.mark(10);
      while ((ch = bin.read()) != -1) {
        System.out.print((char) ch);
      }
      bin.reset();
      byte[] bytes = new byte[10];
      bin.read(bytes);

      String str = new String(bytes);
      System.out.println("bytes " + str);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
