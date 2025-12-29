package com.nottnott.app.chapter7;

// import com.nottnott.app.chapter8.Parent;

// import com.nottnott.app.chapter8.Data;

public class StringDemo {
  public static void main(String[] args) {
    String str = "Hello World";
    String str2 = "Hello World";
    String str3 = new String("Hello World");
    System.out.println("str uppercase " + str.toUpperCase());
    System.out.println("str == str2 " + (str == str2));
    System.out.println("str == str3 " + (str == str3));

    System.out.println("equals " + (str.equals(str3)));

    String another = str + " Hi";
    System.out.println("another " + another);

    String str4 = null;
    // System.out.println("equals " + (str4.equals("Hello World")));
    System.out.println("equals " + ("Hello World".equals(str4)));

    // Data data = new Data();
    // data.value++;

    // Parent parent = new Parent();
    // Parent.data++;
  }
}
