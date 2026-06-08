package com.nottnott.app.oopdesign.pattern.composite;

public abstract class UIWidget {
  String name;

  UIWidget(String name) {
    this.name = name;
  }

  abstract void paint();
}
