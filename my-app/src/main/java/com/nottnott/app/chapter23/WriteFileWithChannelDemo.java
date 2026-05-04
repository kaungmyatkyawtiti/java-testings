package com.nottnott.app.chapter23;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteFileWithChannelDemo {
  public static void main(String[] args) {
    Path path = Path.of("nio.txt");
    try (SeekableByteChannel channel = Files.newByteChannel(
        path,
        StandardOpenOption.WRITE,
        StandardOpenOption.CREATE)) {
      ByteBuffer buffer = ByteBuffer.allocate(26);
      for (int i = 0; i < 26; i++) {
        buffer.put((byte) ('A' + i));
      }
      buffer.rewind();
      channel.write(buffer);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
