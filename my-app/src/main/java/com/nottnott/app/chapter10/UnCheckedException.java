package com.nottnott.app.chapter10;

class CustomException extends RuntimeException {
  public CustomException(String msg) {
    super(msg);
  }
}

public class UnCheckedException {
  static void process(int data) {
    if (data % 2 == 0) {
      throw new CustomException("Even Exception");
    } else {
      System.out.println("Ok " + data);
    }
  }

  public static void main(String[] args) {
    try {
      process(10);
    } catch (Exception e) {
      StackTraceElement st[] = e.getStackTrace();
      for (int i = 0; i < st.length; i++) {
        System.out.println(
            "Class " + st[i].getClassName() +
                " Method " + st[i].getMethodName() +
                " LineNo. " + st[i].getLineNumber());
      }
    }
  }
}
