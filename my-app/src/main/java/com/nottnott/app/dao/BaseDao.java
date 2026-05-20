package com.nottnott.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
  Connection conn;

  protected BaseDao() {
    try {
      this.conn = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/javase6_sql",
          "root",
          "kaungmyatkyaw@2003");
      System.out.println("MariaDB connected successfully");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Connection getConnnection() {
    return this.conn;
  }

  public static void main(String[] args) {
    new BaseDao();
  }
}
