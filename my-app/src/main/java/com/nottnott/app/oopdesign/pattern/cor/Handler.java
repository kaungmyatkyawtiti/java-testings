package com.nottnott.app.oopdesign.pattern.cor;

public abstract class Handler {
  Handler next;

  public void setNext(Handler next) {
    this.next = next;
  }

  abstract void handle(Request request);
}
