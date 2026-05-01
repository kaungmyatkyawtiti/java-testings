package com.nottnott.app.chapter18;

class Data {
  int value;

  public Data(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    System.out.println("To String called");
    return "Data " + value;
  }
}

public class StringMethod {
  public static void main(String[] args) {
    Data data = new Data(10);

    String str = "Hello" + " World " + false;
    System.out.println("Str " + str);
    System.out.println("length " + str.length());

    System.out.println("" + data);
    System.out.println("CharAt(0) " + str.charAt(0));

    char[] chars = new char[5];
    str.getChars(0, 5, chars, 0);

    String str2 = new String(chars);
    System.out.println("Str2 " + str2);

    System.out.println("RegionMatches " + str.regionMatches(0, str2, 0, 4));
    System.out.println("Str2 startWith " + str2.startsWith("Hello"));
    System.out.println("Str2 endsWith " + str2.endsWith("false"));

    System.out.println("Apple.compareTo(Banana) " + "apple".compareTo("banana"));
  }
}
