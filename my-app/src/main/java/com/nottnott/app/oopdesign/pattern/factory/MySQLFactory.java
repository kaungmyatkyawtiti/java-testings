package com.nottnott.app.oopdesign.pattern.factory;

public class MySQLFactory extends ConnectionFactory {
  @Override
  Connection createConnection() {
    return new MySQLConnection();
  }
}
