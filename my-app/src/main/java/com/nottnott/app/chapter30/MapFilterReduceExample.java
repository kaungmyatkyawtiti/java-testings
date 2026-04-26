package com.nottnott.app.chapter30;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

enum Gender {
  Male, Female;
}

class Human {
  String name;
  int age;
  Gender gender;

  Human(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}

public class MapFilterReduceExample {
  public static void main(String[] args) {
    Human lists[] = {
        new Human("Nott Nott", 20, Gender.Male),
        new Human("Kaung Myat", 24, Gender.Male),
        new Human("Hla Hla", 19, Gender.Female),
        new Human("Daw Mya", 40, Gender.Female),
        new Human("Mg Myint", 25, Gender.Male),
    };

    Stream<Human> stream = Arrays.stream(lists);
    stream.filter(h -> h.gender == Gender.Male)
        .reduce((a, b) -> a.getAge() < b.getAge() ? a : b)
        .map(h -> h.getName())
        .stream()
        .forEach(System.out::println);
    ;
  }
}
