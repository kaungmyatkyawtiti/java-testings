package com.nottnott.app.oopdesign.pattern.composite;

public class View extends UIWidget {
  View(String name) {
    super(name);
  }

  @Override
  void paint() {
    System.out.println("Paint " + this.name);
  }
}
