package com.nottnott.app.chapter17;

import com.nottnott.app.chapter17.Id.Type;

record Worker(String name, Id id) {
}

record Id(int idNum, Type type) {
  enum Type {
    FullTime, PartTime;
  }
}

public class PatternMatchingWithRecord {
  public static void main(String[] args) {
    Object person = new Worker("Nott Nott", new Id(1, Type.FullTime));
    if (person instanceof Worker worker) {
      System.out.println("Name " + worker.name());
      System.out.println("Id " + worker.id().idNum());
      System.out.println("Type " + worker.id().type());
    }
  }
}
