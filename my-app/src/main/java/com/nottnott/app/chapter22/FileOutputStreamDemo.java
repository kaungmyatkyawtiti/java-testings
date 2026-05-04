package com.nottnott.app.chapter22;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
  public static void main(String[] args) {
    File file = new File("../../demo.txt");

    try (FileOutputStream fout = new FileOutputStream(file)) {
      String str = "Hello World";
      fout.write(str.getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
