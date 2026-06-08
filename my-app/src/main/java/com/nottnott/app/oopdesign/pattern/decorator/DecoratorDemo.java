package com.nottnott.app.oopdesign.pattern.decorator;

public class DecoratorDemo {
  public static void main(String[] args) {
    MoHinGa m = new WithNanNanPin(new WithBelOu(new PlainMoHinGa()));
    System.out.println(m.prepare());
  }
}
