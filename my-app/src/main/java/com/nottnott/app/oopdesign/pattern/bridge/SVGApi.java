package com.nottnott.app.oopdesign.pattern.bridge;

public class SVGApi implements DrawingAPI {

  @Override
  public void drawCircle() {
    System.out.println("Drawing svg circle");
  }

  @Override
  public void drawRectangle() {
    System.out.println("Drawing svg rectangle");
  }
}
