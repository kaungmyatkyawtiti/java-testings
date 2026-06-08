package com.nottnott.app.oopdesign.pattern.template;

public class TemplateDemo {
  public static void main(String[] args) {
    Action sale = new SaleAction();
    sale.process();

    Action order = new OrderAction();
    order.process();
  }
}
