package com.nottnott.app.oopdesign.pattern.bridge;

public class CanvasApi implements DrawingAPI {
  @Override
  public void drawCircle() {
    System.out.println("Drawing canvas circle");
  }

  @Override
  public void drawRectangle() {
    System.out.println("Drawing canvas rectangle");
  }
}
