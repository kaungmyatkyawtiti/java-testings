package com.nottnott.app.chapter21;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    Formatter formatter = new Formatter();
    formatter.format("%tr", calendar);
    System.out.println("Date " + formatter);
    formatter.close();

    formatter = new Formatter();
    formatter.format("Formatter is easy %s Digit %.2f", "Java", 13.4);
    System.out.println("String " + formatter);
    formatter.close();
  }
}
