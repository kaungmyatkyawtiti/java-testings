package com.nottnott.app.oopdesign.pattern.bridge;

abstract class Shape {
  DrawingAPI api;

  Shape(DrawingAPI api) {
    this.api = api;
  }

  abstract void draw();
}
