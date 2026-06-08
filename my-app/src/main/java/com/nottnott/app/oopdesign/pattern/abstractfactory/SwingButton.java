package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class SwingButton implements Button {
  @Override
  public void paint() {
    System.out.println("Swing button paint");
  }
}
