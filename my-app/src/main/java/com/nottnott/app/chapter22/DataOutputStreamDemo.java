package com.nottnott.app.chapter22;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
  public static void main(String[] args) {
    File file = new File("./data.bin");
    try (var dout = new DataOutputStream(new FileOutputStream(file))) {
      dout.writeInt(10);
      dout.writeDouble(20.0);
      dout.writeUTF("Hello World");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
