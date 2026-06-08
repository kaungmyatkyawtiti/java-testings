package com.nottnott.app.oopdesign.pattern.singleton;

import java.awt.Toolkit;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton another = Singleton.getSingleton();
    System.out.println("Singleton " + (singleton == another));

    Runtime rt1 = Runtime.getRuntime();
    Runtime rt2 = Runtime.getRuntime();
    System.out.println("Runtime " + (rt1 == rt2));

    Toolkit tk1 = Toolkit.getDefaultToolkit();
    Toolkit tk2 = Toolkit.getDefaultToolkit();
    System.out.println("Toolkit " + (tk1 == tk2));
  }
}
