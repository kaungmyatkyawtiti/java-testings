package com.nottnott.app.chapter23;

import java.io.BufferedOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileWithBufferOutputStream {
  public static void main(String[] args) {
    Path path = Path.of("testing.txt");
    try (BufferedOutputStream bOut = new BufferedOutputStream(Files.newOutputStream(path))) {
      for (int i = 0; i < 26; i++) {
        bOut.write((byte) ('A' + i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
