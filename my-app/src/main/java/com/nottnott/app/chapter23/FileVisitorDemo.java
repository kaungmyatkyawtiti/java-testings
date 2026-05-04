package com.nottnott.app.chapter23;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
  @Override
  public FileVisitResult visitFile(Path path, BasicFileAttributes attr)
      throws IOException {
    System.out.println(path);
    return FileVisitResult.CONTINUE;
  }
}

public class FileVisitorDemo {
  public static void main(String[] args) {
    Path path = Path.of("./");
    try {
      Files.walkFileTree(path, new MyFileVisitor());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
