package com.nottnott.app.chapter12;

public class Human {
  @NotNull(message = "name should not be null")
  String name;

  @NotNull(message = "address should not be null")
  String address;

  @NotNull(message = "biography should not be null")
  String biography;
}
