package com.nottnott.app.chapter6;

public class OverLoadDemo {
  int add(int a, int b) {
    return a + b;
  }

  float add(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    OverLoadDemo overLoadDemo = new OverLoadDemo();
    int result = overLoadDemo.add(1, 3);
    float result2 = overLoadDemo.add(2.4F, 2.6F);
  }
}
