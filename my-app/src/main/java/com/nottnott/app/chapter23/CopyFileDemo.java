package com.nottnott.app.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFileDemo {
  public static void main(String[] args) {
    Path source = Path.of("./nio2.txt");
    Path target = Path.of("./nio2_copy.txt");
    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
