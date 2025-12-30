package com.nottnott.app.chapter10;

class BusinessLogicException extends Exception {
  public BusinessLogicException(String msg) {
    super(msg);
  }
}

class CreditException extends BusinessLogicException {
  public CreditException(String msg) {
    super(msg);
  }
}

class DebitException extends BusinessLogicException {
  public DebitException(String msg) {
    super(msg);
  }
}

class Account {
  private int balance;

  // default constructor
  Account() {
  }

  // pararized constructor
  Account(int balance) throws BusinessLogicException {
    System.out.println("Constructor " + balance);
    if (balance > 0) {
      this.balance = balance;
    } else {
      throw new BusinessLogicException("Invalid amount");
    }
  }

  void credit(int amount) throws CreditException {
    if (amount > 0) {
      this.balance += amount;
    } else {
      throw new CreditException("Invalid amount in credit");
    }
  }

  void debit(int amount) throws DebitException {
    if (this.balance >= amount && amount >= 0) {
      this.balance -= amount;
    } else {
      throw new DebitException("Invalid amount in debit");
    }
  }

  @Override
  public String toString() {
    return "Account balance: " + balance;
  }
}

public class CustomExceptionDemo {
  public static void main(String[] args) {
    Account account = new Account();
    try {
      account.credit(-100);
      account.debit(50);
    } catch (CreditException ce) {
      System.out.println("CreditException " + ce.getMessage());
    } catch (DebitException de) {
      System.out.println("DebitException " + de.getMessage());
    } catch (BusinessLogicException be) {
      System.out.println("BusinessLogicException " + be.getMessage());
    }
    System.out.println("account " + account);
  }
}
