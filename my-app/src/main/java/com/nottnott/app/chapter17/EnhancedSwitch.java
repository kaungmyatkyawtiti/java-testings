package com.nottnott.app.chapter17;

public class EnhancedSwitch {
  static String getMonthName() {
    return "Jan or Feb or Mar";
  }

  public static void main(String[] args) {
    int month = 1;
    switch (month) {
      case 1, 2, 3:
        System.out.println("1 or 2 or 3");
        break;
      default:
        System.out.println("Other Months");
        break;
    }

    String monthName = switch (month) {
      case 1, 2, 3:
        yield "Jan or Feb or Mar";
      default:
        yield "Others";
    };
    System.out.println("Month Name " + monthName);

    String monthName2 = switch (month) {
      case 1, 2, 3 ->
        "Jan or Feb or Mar";
      default -> "Others";
    };
    System.out.println("Month Name with Arrow " + monthName2);

    String monthName3 = switch (month) {
      case 1, 2, 3 -> getMonthName();
      default -> {
        yield "Others";
      }
    };
    System.out.println("Month Name with method " + monthName3);
  }
}
