package com.nottnott.app.chapter7;

class Account {
  private int balance;

  public void setBalance(int balance) {
    this.balance = balance;
  }
}

public class NonEncapsulation {
  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(200);
  }
}
