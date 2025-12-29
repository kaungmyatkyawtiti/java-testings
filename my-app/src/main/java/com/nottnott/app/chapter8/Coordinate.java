package com.nottnott.app.chapter8;

class TwoD {
  private int x, y;

  public TwoD(int x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("TwoD constructor");
  }

  void print() {
    System.out.println("x " + x + " y " + y);
  }
}

class ThreeD extends TwoD {
  int z;

  public ThreeD(int x, int y, int z) {
    super(x, y);
    this.z = z;
    System.out.println("ThreeD constructor");
  }

  void print() {
    super.print();
    System.out.println("z " + this.z);
  }
}

public class Coordinate {
  public static void main(String[] args) {
    ThreeD obj = new ThreeD(10, 8, 5);
    // System.out.println("obj.x " + obj.x + " y " + obj.y + " z " + obj.z);

    obj.print();
  }
}
