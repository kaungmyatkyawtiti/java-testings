package com.nottnott.app.chapter12;

enum Gender {
  Male, Female;
}

public class GenderWithEnum {
  public static void main(String[] args) {
    Gender gender = Gender.Male;
    System.out.println("Gender " + gender);

    if (gender == Gender.Male) {
      System.out.println("Male");
    } else if (gender == Gender.Female) {
      System.out.println("Female");
    } else {
      System.out.println("Other");
    }

    for (Gender g : Gender.values()) {
      System.out.println("G " + g);
    }

    int result = Gender.Male.compareTo(Gender.Female);
    System.out.println("result " + result);
  }
}
