package com.nottnott.app.oopdesign.pattern.observerobserable;

public class View implements Subscriber {
  String name;

  View(String name) {
    this.name = name;
  }

  @Override
  public void update(String data) {
    System.out.println("View " + this.name + " got update " + data);
  }
}
