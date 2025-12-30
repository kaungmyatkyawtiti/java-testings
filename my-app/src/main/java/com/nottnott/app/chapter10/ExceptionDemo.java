package com.nottnott.app.chapter10;

public class ExceptionDemo {
  public static void main(String[] args) {
    System.out.println("dividing 10/0 ");
    String str = null;

    try {
      int result = 10 / 2;
      System.out.println("result " + result);
      System.out.println("toLowerCase " + str.toLowerCase());
    } catch (ArithmeticException ae) {
      System.out.println("ArithmeticException " + ae.getMessage());
    }
    // catch (NullPointerException ne) {
    // System.out.println("NullPointerException " + ne.getMessage());
    // }
    catch (Exception e) {
      System.out.println("Exception " + e.getMessage());
    } finally {
      System.out.println("finally always run");
    }
    System.out.println("done");
  }
}
