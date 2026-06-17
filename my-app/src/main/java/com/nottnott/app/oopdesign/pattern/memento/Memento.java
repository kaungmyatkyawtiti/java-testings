package com.nottnott.app.oopdesign.pattern.memento;

public class Memento {
  String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getSavedState() {
    return this.state;
  }
}
