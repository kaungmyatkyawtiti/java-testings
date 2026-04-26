package com.nottnott.app.chapter14;

class GenParent<T> {
  T value;

  GenParent(T value) {
    this.value = value;
  }

  T getValue() {
    return this.value;
  }
}

class GenChild<T> extends GenParent<T> {
  GenChild(T value) {
    super(value);
  }
}

public class GenericSuper {
  public static void main(String[] args) {
    GenChild<String> child = new GenChild<>("Hello");
    System.out.println("Child value toLowerCase " + child.value.toLowerCase());
    System.out.println("Child instanceOf GenChild<String> " + (child instanceof GenChild<String>));

    GenChild<Number> child2 = new GenChild<>(10);

    System.out.println("Child instanceOf GenChild<?> " + (child instanceof GenChild<?>));
    System.out.println("Child2 instanceOf GenChild<?> " + (child2 instanceof GenChild<?>));

    // GenChild<Float> child3 = (GenChild<Float>) child2;
    // System.out.println("Child3 " + child3.value);
  }
}
