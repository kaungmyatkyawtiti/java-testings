package com.nottnott.app.chapter8;

public class InheritanceDemo {
  public static void main(String[] args) {
    Human h = new Doctor("Mg Hla", 30, "OG");
    h.eat();
    h.work();

    h = new Teacher("Daw Hla", 28, "english");
    h.eat();
    h.work();

    h = new Human("Ordinary One", 29);
    h.eat();
    h.work();
  }
}
