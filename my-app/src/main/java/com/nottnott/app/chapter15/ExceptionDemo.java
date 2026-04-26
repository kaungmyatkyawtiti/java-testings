package com.nottnott.app.chapter15;

class CustomException extends Exception {
  public CustomException(String msg) {
    super(msg);
  }
}

interface AccessFn {
  int getItemAt(int index) throws CustomException;
}

public class ExceptionDemo {
  static int getItem(int index) throws CustomException {
    return 100;
  }

  public static void main(String[] args) {
    AccessFn fn = ExceptionDemo::getItem;
    try {
      System.out.println("fn " + fn.getItemAt(100));
    } catch (CustomException e) {
      e.printStackTrace();
    }
  }
}
