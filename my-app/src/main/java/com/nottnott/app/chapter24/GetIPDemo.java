package com.nottnott.app.chapter24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPDemo {
  public static void main(String[] args) {
    String host = "www.google.com";
    InetAddress[] ipAddresses;

    try {
      InetAddress address = InetAddress.getByName(host);
      System.out.println("Single " + address);

      InetAddress address2 = InetAddress.getByName("localhost");
      System.out.println("Single 2 " + address2);
      System.out.println("Localhost " + InetAddress.getLocalHost());

      ipAddresses = InetAddress.getAllByName(host);
      for (InetAddress ip : ipAddresses) {
        System.out.println("IP " + ip);
        System.out.println("Hostname " + ip.getHostName());
      }
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
