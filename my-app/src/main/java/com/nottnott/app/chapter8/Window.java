package com.nottnott.app.chapter8;

class Window95 {
  public void startComputer() {
    System.out.println("start computer");
  }
}

class Window98 extends Window95 {
  public void feature() {
    System.out.println("new feature");
  }
}

public class Window {
  public static void main(String[] args) {
    Window98 win = new Window98();
    win.startComputer();
    win.feature();
  }
}
