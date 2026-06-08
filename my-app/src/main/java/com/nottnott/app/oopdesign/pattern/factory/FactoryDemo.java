package com.nottnott.app.oopdesign.pattern.factory;

public class FactoryDemo {
  public static void main(String[] args) {
    ConnectionFactory factory = new OracleFactory();
    Connection conn = factory.createConnection();
    conn.open();
  }
}
