package com.nottnott.app.oopdesign.pattern.strategy;

public class StrategyDemo {
  public static void main(String[] args) {
    SearchAlgorithm algorithm = new SearchAlgorithm();

    algorithm.setStrategy(new LinearSearch());
    algorithm.search();

    algorithm.setStrategy(new BinarySearch());
    algorithm.search();
  }
}
