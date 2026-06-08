package com.nottnott.app.oopdesign.pattern.cor;

import java.util.HashMap;

public class Request {
  String url;

  public Request(String url) {
    this.url = url;
  }

  HashMap<String, String> headers = new HashMap<>();

  void addHeader(String key, String value) {
    this.headers.put(key, value);
  }
}
