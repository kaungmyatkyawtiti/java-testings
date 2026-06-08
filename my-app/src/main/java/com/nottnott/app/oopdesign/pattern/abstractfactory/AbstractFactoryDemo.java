package com.nottnott.app.oopdesign.pattern.abstractfactory;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    UIFactory factory = new SwingFactory();

    Button button = factory.createButton();
    button.paint();

    Label label = factory.createLabel();
    label.paint();
  }
}
