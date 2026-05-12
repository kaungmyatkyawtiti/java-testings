package com.nottnott.app.chapter24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
  public static void main(String[] args) {
    try (
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();) {

      String line;
      System.out.println("Enter request send to server");
      line = scanner.next() + "\r\n";

      byte[] buffer = line.getBytes();
      DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

      packet.setAddress(InetAddress.getLocalHost());
      packet.setPort(9000);

      socket.send(packet);

      buffer = new byte[1024];
      DatagramPacket receivedPacket = new DatagramPacket(buffer, buffer.length);
      socket.receive(receivedPacket);

      System.out
          .println("Client got from server " + (new String(receivedPacket.getData(), 0, receivedPacket.getLength())));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
