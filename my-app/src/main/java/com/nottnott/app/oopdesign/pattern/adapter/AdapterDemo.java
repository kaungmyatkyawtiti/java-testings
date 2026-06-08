package com.nottnott.app.oopdesign.pattern.adapter;

public class AdapterDemo {
  public static void main(String[] args) {
    Api api = new ClassAdapter();
    api.api();
  }
}
