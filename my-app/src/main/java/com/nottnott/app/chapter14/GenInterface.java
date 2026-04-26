package com.nottnott.app.chapter14;

class Human implements Comparable<Human> {
  String name;
  int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Human another) {
    return this.age - another.age;
  }
}

interface MinMax<T extends Comparable<T>> {
  T min();

  T max();
}

class List<T extends Comparable<T>> implements MinMax<T> {
  T[] items;

  List(T[] items) {
    this.items = items;
  }

  @Override
  public T min() {
    T minEle = this.items[0];
    for (int i = 0; i < this.items.length; i++) {
      if (minEle.compareTo(this.items[i]) > 0) {
        minEle = this.items[i];
      }
    }
    return minEle;
  }

  @Override
  public T max() {
    T maxEle = this.items[0];
    for (int i = 0; i < this.items.length; i++) {
      if (maxEle.compareTo(this.items[i]) < 0) {
        maxEle = this.items[i];
      }
    }
    return maxEle;
  }
}

public class GenInterface {
  public static void main(String[] args) {
    Human[] humans = {
        new Human("H1", 18),
        new Human("H2", 22),
        new Human("H3", 30),
    };

    List<Human> list = new List<>(humans);
    Human oldest = list.max();
    Human youngest = list.min();

    System.out.println("Oldest " + oldest.age);
    System.out.println("Youngest " + youngest.age);

    String[] strArrays = {
        "Orange",
        "Banana",
        "Apple"
    };

    List<String> list2 = new List<>(strArrays);
    String smallest = list2.min();
    String largest = list2.max();
    System.out.println("Samllest " + smallest);
    System.out.println("Largest " + largest);
  }
}
