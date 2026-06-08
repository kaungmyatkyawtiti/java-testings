package com.nottnott.app.oopdesign.pattern.factory;

public class MySQLConnection implements Connection {
  @Override
  public void open() {
    System.out.println("MySQL connection open");
  }
}
