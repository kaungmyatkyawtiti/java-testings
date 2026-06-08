package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class SwingFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new SwingButton();
  }

  @Override
  public Label createLabel() {
    return new SwingLabel();
  }
}
