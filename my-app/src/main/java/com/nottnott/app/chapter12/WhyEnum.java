package com.nottnott.app.chapter12;

interface IfGender {
  int MALE = 1;
  int FEMALE = 2;
}

public class WhyEnum {
  public static void main(String[] args) {
    int gender = IfGender.MALE;
    gender = IfGender.FEMALE;

    System.out.println("Gender " + gender);
  }
}
