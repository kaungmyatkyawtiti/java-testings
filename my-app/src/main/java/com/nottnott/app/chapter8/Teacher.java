package com.nottnott.app.chapter8;

public class Teacher extends Human {
  String subject;

  Teacher(String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
  }

  @Override
  public void work() {
    System.out.println(this.name + " teaches students");
  }
}
