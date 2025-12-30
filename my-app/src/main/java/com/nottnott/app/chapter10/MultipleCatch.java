package com.nottnott.app.chapter10;

public class MultipleCatch {
  public static void main(String[] args) {
    try {
      int[] arr = { 10, 20, 30 };
      System.out.println("arr[4] " + arr[2]);

      String str = null;
      System.out.println("upper case " + str.toUpperCase());
    }
    /*
     * catch (ArrayIndexOutOfBoundsException ae) {
     * System.out.println("ArrayIndexOutOfBoundsException " + ae.getMessage());
     * ae.printStackTrace();
     * } catch (NullPointerException ne) {
     * System.out.println("ArrayIndexOutOfBoundsException " + ne.getMessage());
     * }
     */
    catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println("Something bad happened " + e.getMessage());
      e.printStackTrace();
    }
  }
}
