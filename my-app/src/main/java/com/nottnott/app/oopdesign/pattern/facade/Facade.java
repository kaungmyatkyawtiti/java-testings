package com.nottnott.app.oopdesign.pattern.facade;

public class Facade {
  ApiOne apiOne = new ApiOne();
  ApiTwo apiTwo = new ApiTwo();

  void process() {
    apiOne.apiOne();
    apiTwo.apiTwo();
  }
}
