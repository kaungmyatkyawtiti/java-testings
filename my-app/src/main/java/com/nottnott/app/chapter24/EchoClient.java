package com.nottnott.app.chapter24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  public static void main(String[] args) {
    try (
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("localhost", 9000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        OutputStream out = socket.getOutputStream();) {

      System.out.println("Enter a Line send to a server");
      String line = scanner.nextLine() + "\r\n";
      out.write(line.getBytes());
      String resp = in.readLine();
      System.out.println("Response ==> " + resp);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
