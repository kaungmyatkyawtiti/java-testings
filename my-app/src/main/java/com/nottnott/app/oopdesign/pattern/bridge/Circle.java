package com.nottnott.app.oopdesign.pattern.bridge;

public class Circle extends Shape {
  Circle(DrawingAPI api) {
    super(api);
  }

  @Override
  void draw() {
    api.drawCircle();
  }
}
