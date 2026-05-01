package com.nottnott.app.chapter21;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
  public static void main(String[] args) {
    Currency c = Currency.getInstance(Locale.US);
    System.out.println("Symbol " + c.getSymbol());
    System.out.println("Fraction " + c.getDefaultFractionDigits());

    Currency myanmarCurrency = Currency.getInstance("MMK");
    System.out.println("Symbol: " + myanmarCurrency.getSymbol());
    System.out.println("Fraction: " + myanmarCurrency.getDefaultFractionDigits());
  }
}
