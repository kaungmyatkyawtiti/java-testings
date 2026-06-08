package com.nottnott.app.oopdesign.pattern.facade;

public class WithoutFacade {
  ApiOne apiOne = new ApiOne();
  ApiTwo apiTwo = new ApiTwo();

  void process() {
    apiOne.apiOne();
    apiTwo.apiTwo();
  }

  public static void main(String[] args) {
    WithoutFacade without = new WithoutFacade();
    without.process();
  }
}
