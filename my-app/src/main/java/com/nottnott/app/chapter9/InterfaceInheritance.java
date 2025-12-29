package com.nottnott.app.chapter9;

interface A {
  void methodA();
}

interface B {
  void methodB();
}

interface C extends A, B {
  void methodC();
}

interface D {
  void methodC();

  void methodD();
}

class MyClass implements C, D {
  @Override
  public void methodA() {
    System.out.println("methodA");
  }

  @Override
  public void methodB() {
    System.out.println("methodB");
  }

  @Override
  public void methodC() {
    System.out.println("methodC");
  }

  @Override
  public void methodD() {
    System.out.println("methodD");
  }
}

public class InterfaceInheritance {

}
