package com.nottnott.app.oopdesign.pattern.composite;

public class CompositeDemo {
  public static void main(String[] args) {
    ViewGroup parent = new ViewGroup("Parent1");

    parent.addChild(new View("Button"));
    parent.addChild(new View("Label"));

    ViewGroup child0 = new ViewGroup("Child0");

    child0.addChild(new View("Button 1 of child0"));
    child0.addChild(new View("Label 1 of child0"));

    parent.addChild(child0);

    parent.paint();
  }
}
