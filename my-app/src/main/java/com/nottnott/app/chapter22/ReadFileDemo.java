package com.nottnott.app.chapter22;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileDemo {
  public static void main(String[] args) {
    File file = new File("src/main/java/com/nottnott/app/chapter21/TimerDemo.java");
    try (var fin = new FileInputStream(file)) {
      int size = fin.available();
      int n = size / 40;
      for (int i = 0; i < n; i++) {
        System.out.print((char) fin.read());
      }
      System.out.println("Available " + fin.available());
      byte[] bytes = new byte[n];
      if ((fin.read(bytes)) != n) {
        System.out.println("Cannot read");
      }
      String str = new String(bytes);
      System.out.println(str);

      fin.skip(40);
      int ch;
      while ((ch = fin.read()) != -1) {
        System.out.print((char) ch);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
