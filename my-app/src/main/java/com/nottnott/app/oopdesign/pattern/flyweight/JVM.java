package com.nottnott.app.oopdesign.pattern.flyweight;

public class JVM implements Platform {
  public JVM() {
    System.out.println("Create JVM");
  }

  @Override
  public void execute(Code code) {
    System.out.println("JVM executed code " + code.getCode());
  }
}
