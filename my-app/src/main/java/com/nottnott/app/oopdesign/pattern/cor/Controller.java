package com.nottnott.app.oopdesign.pattern.cor;

public class Controller extends Handler {
  @Override
  void handle(Request request) {
    System.out.println("Controller handled " + request.url);
  }
}
