package com.nottnott.app.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Human implements Comparable<Human> {
  String name;
  int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Human another) {
    if (this.age - another.age == 0) {
      return this.name.compareTo(another.name);
    }

    return this.age - another.age;
  }

  @Override
  public String toString() {
    return "Human name " + name + " age " + age;
  }
}

public class CustomList {
  public static void main(String[] args) {
    List<Human> list = new ArrayList<>();
    list.add(new Human("Kaung Myat", 23));
    list.add(new Human("Aye Aye", 40));
    list.add(new Human("Nott Nott", 22));
    list.add(new Human("Aung Aung ", 22));

    Collections.sort(list);
    Collections.reverse(list);

    for (Human h : list) {
      System.out.println("Human " + h);
    }
  }
}
