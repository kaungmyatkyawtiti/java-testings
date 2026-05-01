package com.nottnott.app.chapter19;

class MyClass implements Cloneable {
  int a, b;

  MyClass(int a, int b) {
    this.a = a;
    this.b = b;
  }

  MyClass cloneTest() {
    try {
      MyClass clone = (MyClass) super.clone();
      return clone;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public String toString() {
    return "MyClass a " + a + " b " + b;
  }
}

public class CloneDemo {
  public static void main(String[] args) {
    MyClass obj1 = new MyClass(1, 200);
    MyClass obj2 = obj1.cloneTest();
    System.out.println("Obj1 " + obj1);
    System.out.println("Obj2 " + obj2);

    obj1.a = 10;
    System.out.println("Obj1 " + obj1);
    System.out.println("Obj2 " + obj2);
  }
}
