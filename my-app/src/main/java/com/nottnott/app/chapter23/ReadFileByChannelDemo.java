package com.nottnott.app.chapter23;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileByChannelDemo {
  public static void main(String[] args) {
    Path path = Path.of("src/main/java/com/nottnott/app/chapter21/TimerDemo.java");
    try (SeekableByteChannel bytChannel = Files.newByteChannel(path)) {
      ByteBuffer buffer = ByteBuffer.allocate(1024);
      int count;
      do {
        count = bytChannel.read(buffer);
        if (count != -1) {
          buffer.rewind();
          for (int i = 0; i < count; i++) {
            System.out.print((char) buffer.get());
          }
        }
      } while (count != -1);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
