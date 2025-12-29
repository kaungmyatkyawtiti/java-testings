package com.nottnott.app.chapter7;

public class Money {
  private int amount;

  Money() {
    this.amount = 0;
  }

  Money(int amount) {
    this.amount = amount;
  }

  Money add(Money another) {
    return new Money(this.amount + another.amount);
  }

  @Override
  public String toString() {
    return "Money amount " + amount;
  }

  public static void main(String[] args) {
    Money a = new Money(10);
    Money b = new Money(20);
    Money c = a.add(b);

    System.out.println("a " + a);
    System.out.println("b " + b);
    System.out.println("c " + c);
  }
}
