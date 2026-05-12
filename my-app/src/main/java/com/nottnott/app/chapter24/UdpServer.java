package com.nottnott.app.chapter24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UdpServer {
  public static void main(String[] args) {
    try (DatagramSocket serverSocket = new DatagramSocket(9000)) {
      while (true) {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        serverSocket.receive(packet);

        System.out.println("Server got " + (new String(packet.getData(), 0, packet.getLength())));

        String response = "Response from server " + (new Date()) + "\r\n";
        byte[] responseBuffer = response.getBytes();
        DatagramPacket packetResponse = new DatagramPacket(responseBuffer, responseBuffer.length);

        packetResponse.setAddress(InetAddress.getLocalHost());
        packetResponse.setPort(packet.getPort());

        serverSocket.send(packetResponse);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
