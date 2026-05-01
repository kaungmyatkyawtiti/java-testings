package com.nottnott.app.chapter19;

public class MathDemo {
  static double degreeToRadian(int degree) {
    return degree * Math.PI / 180;
  }

  public static void main(String[] args) {
    System.out.println("sin 90 " + Math.sin(degreeToRadian(90)));
  }
}
