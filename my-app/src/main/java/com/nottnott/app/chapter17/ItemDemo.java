package com.nottnott.app.chapter17;

record Item(String name, float price, int quantity) {
  float total() {
    return this.price * this.quantity;
  }
}

record Circle(double radius) {
  double area() {
    return Math.PI * radius * radius;
  }
}

public class ItemDemo {
  public static void main(String[] args) {
    Item item = new Item("Apple", 10, 2);
    System.out.println("Total " + item.total());

    Circle circle = new Circle(10);
    System.out.println("Area " + circle.area());
  }
}
