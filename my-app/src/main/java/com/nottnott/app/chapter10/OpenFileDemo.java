package com.nottnott.app.chapter10;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenFileDemo {
  public static void main(String[] args) {
    File file = new File("./src/main/java/com/nottnott/app/chapter10/OpenFileDemo.java");
    // DataInputStream din = null;
    // try {
    // System.out.println("path " + file.getAbsolutePath());
    // din = new DataInputStream(new FileInputStream(file));
    // } catch (FileNotFoundException fe) {
    // System.out.println("FileNotFoundException " + fe.getMessage());
    // } finally {
    // if (din != null) {
    // try {
    // din.close();
    // } catch (IOException ie) {
    // System.out.println("IOException " + ie.getMessage());
    // }
    // }
    // }

    try (DataInputStream din = new DataInputStream(new FileInputStream(file))) {
    } catch (Exception e) {
    }
  }
}
