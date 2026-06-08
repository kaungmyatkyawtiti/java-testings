package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class AWTFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new AWTButton();
  }

  @Override
  public Label createLabel() {
    return new AWTLabel();
  }
}
