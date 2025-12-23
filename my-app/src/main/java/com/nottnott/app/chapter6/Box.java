package com.nottnott.app.chapter6;

/**
 * BoxDemo
 */
public class Box {
  int width, height, depth;

  int volume() {
    return this.width * this.height * this.depth;
  }

  void setDimension(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public static void main(String[] args) {
    Box box = new Box();
    Box box2 = new Box();

    // box.width = 5;
    // box.height = 2;
    // box.depth = 4;
    box.setDimension(5, 2, 4);
    int volume = box.volume();

    // box2.width = 10;
    // box2.height = 5;
    // box2.depth = 6;
    box2.setDimension(10, 5, 6);
    int volume2 = box2.volume();

    System.out.println("volume " + volume);
    System.out.println("volume2 " + volume2);
  }
}
