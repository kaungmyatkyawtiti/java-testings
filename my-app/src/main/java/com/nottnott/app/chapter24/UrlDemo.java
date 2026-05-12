package com.nottnott.app.chapter24;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {
  public static void main(String[] args) {
    try {
      URL url = new URI("https://www.google.com/index.html").toURL();
      System.out.println("Protocol " + url.getProtocol());
      System.out.println("Path " + url.getPath());
      System.out.println("Port " + url.getPort());
      System.out.println("File " + url.getFile());
      System.out.println("External form " + url.toExternalForm());

      URLConnection connection = url.openConnection();
      System.out.println("Content length " + connection.getContentLength());
      System.out.println("Content type " + connection.getContentType());
      System.out.println("Content " + connection.getContent());

      InputStream in = connection.getInputStream();
      int data;
      while ((data = in.read()) != -1) {
        System.out.print((char) data);
      }
      in.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
