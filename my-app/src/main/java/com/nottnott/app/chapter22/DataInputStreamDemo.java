package com.nottnott.app.chapter22;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamDemo {
  public static void main(String[] args) {
    File file = new File("./data.bin");
    try (var din = new DataInputStream(new FileInputStream(file))) {
      int intData = din.readInt();
      double doubleData = din.readDouble();
      String str = din.readUTF();
      System.out.println("Int Data " + intData + " double data " + doubleData + " string data " + str);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
