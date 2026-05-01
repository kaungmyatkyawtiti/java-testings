package com.nottnott.app.chapter19;

import java.io.InputStream;

public class ProcessDemo {
  public static void main(String[] args) {
    Process p = null;

    try {
      p = Runtime.getRuntime().exec("mkdir nottnott-blah-blah");
      try (InputStream in = p.getInputStream()) {
        int data = in.read();
        while (data != -1) {
          System.out.println((char) data);
          data = in.read();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
