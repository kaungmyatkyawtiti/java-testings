package com.nottnott.app.chapter23;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MapChannelReadDemo {
  public static void main(String[] args) {
    Path path = Path.of("src/main/java/com/nottnott/app/chapter21/TimerDemo.java");
    try (FileChannel fChannel = (FileChannel) Files.newByteChannel(path)) {
      long fSize = fChannel.size();
      MappedByteBuffer buffer = fChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
      for (int i = 0; i < fSize; i++) {
        System.out.print((char) buffer.get());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
