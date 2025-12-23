package com.nottnott.app.chapter6;

/**
 * ClassDemo
 */

class Account {
  private int balance;

  // default constructor
  Account() {

  }

  // pararized constructor
  Account(int balance) {
    System.out.println("Constructor " + balance);
    if (balance > 0)
      this.balance = balance;
  }
  // public void setBalance(int balance) {
  // this.balance = balance;
  // }

  void credit(int amount) {
    if (amount > 0)
      this.balance += amount;
  }

  void debit(int amount) {
    if (this.balance >= amount && amount >= 0)
      this.balance -= amount;
  }

  @Override
  public String toString() {
    return "Account balance: " + balance;
  }
}

public class ClassDemo {
  public static void main(String[] args) {
    Account acc = new Account(-300);
    Account acc2 = new Account(200);

    Account acc3 = new Account();

    // acc.balance = 100;
    // System.out.println("acc balance: " + acc.balance);
    // System.out.println("acc2 balance: " + acc2.balance);

    // acc.setBalance(100);
    // acc2.setBalance(100);
    acc.credit(0);
    acc.debit(-200);
    System.out.println("acc " + acc);

    acc2.credit(200);
    System.out.println("acc2 " + acc2);

    System.out.println("acc " + acc);
  }
}
