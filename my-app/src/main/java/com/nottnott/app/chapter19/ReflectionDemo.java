package com.nottnott.app.chapter19;

import java.lang.reflect.Field;

class Human {
  String name;
  int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Another {
  String data;
}

public class ReflectionDemo {
  public static void printFields(Object obj) {
    Class<?> clazz = obj.getClass();
    System.out.println("Class " + clazz.getName());

    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println("Name " + field.getName() + " Type " + field.getType());
    }
  }

  public static void main(String[] args) {
    Human human = new Human("Nott Nott", 22);
    Another another = new Another();
    printFields(human);
    printFields(another);
  }
}
