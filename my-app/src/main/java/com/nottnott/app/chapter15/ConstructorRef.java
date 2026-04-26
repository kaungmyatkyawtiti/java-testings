package com.nottnott.app.chapter15;

interface Factory {
  Human build(String name);
}

class Human {
  String name;

  Human(String name) {
    this.name = name;
    System.out.println("Human Constructor");
  }
}

class Teacher extends Human {
  Teacher(String name) {
    super(name);
    System.out.println("Teacher Constructor");
  }
}

class Doctor extends Human {
  Doctor(String name) {
    super(name);
    System.out.println("Doctor Constructor");
  }
}

public class ConstructorRef {
  public static void main(String[] args) {
    Factory factory = Human::new;
    Human h = factory.build("Human");

    factory = Doctor::new;
    h = factory.build("Dr Someone");
  }
}
