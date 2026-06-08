package com.nottnott.app.oopdesign.pattern.factory;

public class OracleFactory extends ConnectionFactory {
  @Override
  Connection createConnection() {
    return new OracleConnection();
  }
}
