package com.nottnott.app.oopdesign.pattern.bridge;

public class Rectangle extends Shape {
  public Rectangle(DrawingAPI api) {
    super(api);
  }

  @Override
  void draw() {
    api.drawRectangle();
  }
}
