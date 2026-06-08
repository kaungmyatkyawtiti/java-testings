package com.nottnott.app.oopdesign.pattern.factory;

public class OracleConnection implements Connection {
  @Override
  public void open() {
    System.out.println("Oracle connection open");
  }
}
