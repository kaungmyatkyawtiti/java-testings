package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class SwingLabel implements Label {
  @Override
  public void paint() {
    System.out.println("Swing label paint");
  }
}
