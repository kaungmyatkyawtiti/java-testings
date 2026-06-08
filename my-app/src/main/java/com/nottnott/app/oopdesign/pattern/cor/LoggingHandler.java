package com.nottnott.app.oopdesign.pattern.cor;

public class LoggingHandler extends Handler {
  @Override
  void handle(Request request) {
    System.out.println("Logger " + request.url);
    if (this.next != null) {
      this.next.handle(request);
    }
  }
}
