package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class AWTButton implements Button {
  @Override
  public void paint() {
    System.out.println("AWT button paint");
  }
}
