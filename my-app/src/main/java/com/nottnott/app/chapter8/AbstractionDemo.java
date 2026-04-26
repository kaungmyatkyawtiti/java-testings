package com.nottnott.app.chapter8;

class Dog extends AbstractAnimal {
  @Override
  void makeSound() {
    System.out.println("Dog barks");
  }
}

public class AbstractionDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    AbstractAnimal a = new Dog();
    d.makeSound();
    d.sleep();

    a.makeSound();
    a.sleep();
  }
}
