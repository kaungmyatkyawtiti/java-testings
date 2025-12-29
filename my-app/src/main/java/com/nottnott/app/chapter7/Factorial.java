package com.nottnott.app.chapter7;

public class Factorial {
  int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  // 4 = 4 * 3 * 2 * 1
  int factRec(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factRec(n - 1);
    }
  }

  public static void main(String[] args) {
    Factorial fact = new Factorial();
    System.out.println("3 factorial " + fact.factorial(3));
    System.out.println("4 factorial " + fact.factorial(4));

    Factorial factR = new Factorial();
    System.out.println("3 factorial " + factR.factRec(3));
    System.out.println("4 factorial " + factR.factRec(4));
  }
}
