package com.nottnott.app.chapter22;

import java.io.File;

public class FileDemo {
  public static void printDir(String dir) {
    File file = new File(dir);
    if (file.isDirectory()) {
      for (File f : file.listFiles()) {
        printDir(f.getAbsolutePath());
      }
    } else {
      System.out.println(file.getAbsolutePath());
    }
  }

  public static void main(String[] args) {
    File file = new File("src/main/java/com/nottnott/app/chapter21/TimerDemo.java");
    System.out.println("isFile " + file.isFile());
    System.out.println("isDirectory " + file.isDirectory());

    File dir = new File("src/main/java/com/nottnott/app/chapter21/");
    System.out.println("isFile " + dir.isFile());
    System.out.println("isDirectory " + dir.isDirectory());

    System.out.println("Exists " + file.exists());
    System.out.println("Name " + file.getName());
    System.out.println("Path " + file.getPath());
    System.out.println("Absolute path " + file.getAbsolutePath());
    System.out.println("Parent " + file.getParent());
    System.out.println("Size " + file.length());
    printDir("src/main/java/com/nottnott");
  }
}
