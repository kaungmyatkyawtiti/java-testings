package com.nottnott.app.chapter8;

public class Doctor extends Human {
  String speciality;

  Doctor(String name, int age, String speciality) {
    super(name, age);
    this.speciality = speciality;
  }

  @Override
  public void work() {
    System.out.println(this.name + " treats patients");
  }
}
