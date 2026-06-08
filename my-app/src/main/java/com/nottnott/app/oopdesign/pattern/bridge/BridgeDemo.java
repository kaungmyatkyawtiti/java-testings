package com.nottnott.app.oopdesign.pattern.bridge;

public class BridgeDemo {
  public static void main(String[] args) {
    DrawingAPI api = new SVGApi();

    Shape s = new Circle(api);
    s.draw();

    api = new CanvasApi();
    s = new Rectangle(api);
    s.draw();
  }
}
