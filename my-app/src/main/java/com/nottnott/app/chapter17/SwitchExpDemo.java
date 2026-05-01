package com.nottnott.app.chapter17;

interface Employee {

}

class RegularEmployee implements Employee {

}

enum CSuiteEmployee implements Employee {
  CEO, CFO;
}

public class SwitchExpDemo {
  public static void main(String[] args) {
    Employee emp = CSuiteEmployee.CEO;
    if (emp instanceof CSuiteEmployee cse) {
      switch (cse) {
        case CEO -> System.out.println("Boss");
        case CFO -> System.out.println("Money");
      }
    }
  }
}
