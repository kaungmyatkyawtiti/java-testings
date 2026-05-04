package com.nottnott.app.chapter22;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
  String ext;

  public OnlyExt(String ext) {
    this.ext = ext;
  }

  @Override
  public boolean accept(File dir, String name) {
    return name.endsWith(this.ext);
  }
}

public class FilenameFilterDemo {
  public static void main(String[] args) {
    File dir = new File("../");
    OnlyExt javaOnly = new OnlyExt("java");

    for (File f : dir.listFiles(javaOnly)) {
      System.out.println("File " + f.getAbsolutePath());
    }

    File newDir = new File("../");
    newDir.mkdir();
  }
}
