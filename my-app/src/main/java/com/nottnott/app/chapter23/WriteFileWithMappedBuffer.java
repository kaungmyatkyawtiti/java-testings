package com.nottnott.app.chapter23;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteFileWithMappedBuffer {
  public static void main(String[] args) {
    Path path = Path.of("nio2.txt");
    try (FileChannel channel = (FileChannel) Files.newByteChannel(
        path,
        StandardOpenOption.WRITE,
        StandardOpenOption.READ,
        StandardOpenOption.CREATE)) {
      MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
      for (int i = 0; i < 26; i++) {
        buffer.put((byte) ('A' + i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
