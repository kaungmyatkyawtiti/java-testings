package com.nottnott.app.chapter21;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Date " + date);

    long mili = date.getTime();
    Date another = new Date(mili);

    System.out.println("Another " + another);

    Calendar calendar = Calendar.getInstance();
    System.out.println("Date " + calendar.get(Calendar.DATE));
    System.out.println("Day " + calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println("Month " + calendar.get(Calendar.MONTH));

    System.out.println("Time");
    System.out.println("Hour " + calendar.get(Calendar.HOUR));
    System.out.println("Minute " + calendar.get(Calendar.MINUTE));
    System.out.println("Second " + calendar.get(Calendar.SECOND));

    calendar.set(Calendar.HOUR, 10);
    System.out.println("Hour " + calendar.get(Calendar.HOUR));
  }
}
