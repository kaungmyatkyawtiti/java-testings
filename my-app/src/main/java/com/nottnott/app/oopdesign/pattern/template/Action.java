package com.nottnott.app.oopdesign.pattern.template;

public abstract class Action {
  void logging() {
    System.out.println("Logging");
  }

  void security() {
    System.out.println("Security");
  }

  abstract void businessLogic();

  void process() {
    this.logging();
    this.security();
    this.businessLogic();
  }
}
