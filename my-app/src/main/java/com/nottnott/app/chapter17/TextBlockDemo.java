package com.nottnott.app.chapter17;

public class TextBlockDemo {
  public static void main(String[] args) {
    String str = "One\n" + "Two";
    System.out.println("Str " + str);

    String str2 = """
        First Line
        Second Line
        Third Line
        """;
    System.out.println("Str2 " + str2);
  }
}
