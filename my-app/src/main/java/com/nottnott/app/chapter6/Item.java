package com.nottnott.app.chapter6;

/**
 * Item
 */
public class Item {
  int data;

  Item(int data) {
    System.out.println("constructor run");
    this.data = data;
  }

  @Override
  public String toString() {
    System.out.println("toString called");
    return "data: " + data;
  }

  public static void main(String[] args) {
    Item item = new Item(10);
    Item item2 = new Item(20);

    System.out.println("item " + item);
  }
}
