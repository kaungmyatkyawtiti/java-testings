package com.nottnott.app.chapter17;

public record HumanRecord(String name, int age) {
  // public HumanRecord(String name, int age) {
  // this.name = name.trim();
  // this.age = age;
  // }

  public HumanRecord {
    name = name.trim();
  }

  public HumanRecord(String name) {
    this(name, 0);
  }
}
