package com.nottnott.app.chapter17;

public class RecordDemo {
  public static void main(String[] args) {
    HumanRecord rec = new HumanRecord(" Nott Nott ", 22);
    System.out.println("Name " + rec.name() + " <<");
    System.out.println("Age " + rec.age());

    HumanRecord rec2 = new HumanRecord("Kaung Myat");
  }
}
