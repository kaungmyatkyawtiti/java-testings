package com.nottnott.app.chapter10;

// import java.io.FileInputStream;
// import java.io.InputStream;

public class UnCaughtExceptionDemo {
  public static void main(String[] args) {
    // int result = 10 / 0;
    // System.out.println("result " + result);

    // InputStream in = new InputStream(new FileInputStream(new File("demo.java")));
    try {
      int[] arr = { 1, 2, 3 };
      System.out.println("arr[3] " + arr[3]);
    } catch (ArrayIndexOutOfBoundsException ae) {
      System.out.println("ArrayIndexOutOfBoundsException " + ae.getMessage());
    }
  }
}
