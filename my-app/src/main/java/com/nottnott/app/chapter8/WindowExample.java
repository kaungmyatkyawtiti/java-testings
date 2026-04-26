package com.nottnott.app.chapter8;

class WindowOS {
  public void startComputer() {
    System.out.println("Start computer");
  }
}

class Window95 extends WindowOS {
  public void feature() {
    System.out.println("Window95 new feature");
  }
}

class Window98 extends WindowOS {
  public void feature() {
    System.out.println("Window98 new feature");
  }
}

public class WindowExample {
  public static void main(String[] args) {
    Window95 myOS = new Window95();
    myOS.startComputer();
    myOS.feature();

    Window98 myOS2 = new Window98();
    myOS2.startComputer();
    myOS2.feature();

    Data data = new Data();
    data.value = 10;

    Parent parent = new Parent();
    parent.data = 100;
  }
}
