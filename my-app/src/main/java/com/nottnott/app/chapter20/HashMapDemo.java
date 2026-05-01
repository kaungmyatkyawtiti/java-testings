package com.nottnott.app.chapter20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Coconut");
    map.put(2, "Orange");
    map.put(4, "Fish");
    System.out.println("Map get " + map.get(2));
    for (String value : map.values()) {
      System.out.println("Value " + value);
    }
    map.remove(4);
    for (Integer key : map.keySet()) {
      System.out.println("Key " + key);
    }
    for (Entry<Integer, String> keyValues : map.entrySet()) {
      System.out.println("Key " + keyValues.getKey() + " Value " + keyValues.getValue());
    }
  }
}
