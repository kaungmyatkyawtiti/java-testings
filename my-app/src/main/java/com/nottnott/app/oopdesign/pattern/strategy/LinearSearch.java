package com.nottnott.app.oopdesign.pattern.strategy;

public class LinearSearch implements SearchingStrategy {
  @Override
  public void search() {
    System.out.println("Linear Search");
  }
}
