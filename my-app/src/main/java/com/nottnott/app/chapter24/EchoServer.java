package com.nottnott.app.chapter24;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

class EchoHandler extends Thread {
  Socket client;

  EchoHandler(Socket client) {
    this.client = client;
  }

  @Override
  public void run() {
    try (
        DataInputStream in = new DataInputStream(this.client.getInputStream());
        OutputStream out = this.client.getOutputStream()) {
      String request = in.readLine();
      System.out.println("Request from client port " + this.client.getPort() + " message " + request);
      String date = "Echo from server --> " + request + "\r\n";
      out.write(date.getBytes());
      out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

public class EchoServer {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(9000)) {
      System.out.println("Server Listening at 9000");

      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println("Client connected " + socket.getPort());
        new EchoHandler(socket).start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
