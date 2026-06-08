package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class AWTLabel implements Label {
  @Override
  public void paint() {
    System.out.println("AWT label paint");
  }
}
