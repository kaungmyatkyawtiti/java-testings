package com.nottnott.app.oopdesign.pattern.strategy;

public class BinarySearch implements SearchingStrategy {
  @Override
  public void search() {
    System.out.println("Binary search");
  }
}
