package com.nottnott.app.oopdesign.pattern.singleton;

public class Singleton {
  // private static Singleton instance = new Singleton();
  private static Singleton instance;

  private Singleton() {

  }

  public static Singleton getSingleton() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
