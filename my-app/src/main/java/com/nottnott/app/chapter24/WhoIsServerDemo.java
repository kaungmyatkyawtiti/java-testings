package com.nottnott.app.chapter24;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIsServerDemo {
  public static void main(String[] args) {
    try (Socket socket = new Socket("whois.internic.net", 43)) {
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream();

      String domain = "google.com\n";

      out.write(domain.getBytes());
      out.flush();

      int c;
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
