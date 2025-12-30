package com.nottnott.app.chapter10;

public class TryCatchDemo {
  static int div(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("Invalid division");
    }
    return a / b;
  }

  static int another() throws Exception {
    try {
      int result = div(10, 0);
      return result;
    } catch (Exception e) {
      return 10;
      // throw new Exception("Rethrow");
    } finally {
      // return 100;
      throw new Exception("Rethrow");
    }
  }

  public static void main(String[] args) {
    try {
      int result = another();
      System.out.println("Div result " + result);
    } catch (Exception ex) {
      System.out.println("Exception");
      ex.printStackTrace();
    }
  }
}
