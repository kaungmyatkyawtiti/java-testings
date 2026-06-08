package com.nottnott.app.oopdesign.pattern.cor;

public class CORDemo {
  public static void main(String[] args) {
    Handler logging = new LoggingHandler();
    Handler auth = new AuthHandler();
    Handler controller = new Controller();

    logging.setNext(auth);
    auth.setNext(controller);

    Request request = new Request("http://localhost:3000/api");
    request.addHeader("Authorization", "Bearer Token");
    logging.handle(request);
  }
}
