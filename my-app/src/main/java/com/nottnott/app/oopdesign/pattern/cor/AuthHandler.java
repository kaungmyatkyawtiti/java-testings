package com.nottnott.app.oopdesign.pattern.cor;

public class AuthHandler extends Handler {
  @Override
  void handle(Request request) {
    System.out.println("Auth handler " + request.url);
    if (request.headers.containsKey("Authorization")) {
      this.next.handle(request);
    }
  }
}
