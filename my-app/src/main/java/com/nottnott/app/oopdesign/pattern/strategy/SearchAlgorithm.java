package com.nottnott.app.oopdesign.pattern.strategy;

public class SearchAlgorithm {
  SearchingStrategy strategy;

  public void setStrategy(SearchingStrategy strategy) {
    this.strategy = strategy;
  }

  void search() {
    this.strategy.search();
  }
}
