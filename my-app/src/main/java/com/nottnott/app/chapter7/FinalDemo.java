package com.nottnott.app.chapter7;

class FinalBox {
  final int MAX_SIZE = 10;
}

public class FinalDemo {
  public static void main(String[] args) {
    final int DATA = 100; // constant
    // data++;

    FinalBox box = new FinalBox();
    // box.MAX_SIZE++;
  }
}
