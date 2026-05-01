package com.nottnott.app.chapter19;

public class RunTimeDemo extends Object {
  public static void main(String[] args) {
    System.out.println("Runtime Version " + Runtime.version());
    System.out.println("Nano Time " + System.nanoTime());

    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 10, 20, 30, 40 };
    System.arraycopy(arr1, 0, arr2, 1, 2);
    for (int item : arr2) {
      System.out.println("Item " + item);
    }
    System.out.println("userhome " + System.getProperty("user.home"));
    System.out.println("JavaHome " + System.getProperty("java.home"));
    System.out.println("File Separator " + System.getProperty("file.separator"));
  }
}
