package com.nottnott.app.chapter11;

public class VirtualThreadDemo {
  public static void main(String[] args) {
    Thread th = Thread.currentThread();
    System.out.println("Virtual " + th.isVirtual());
  }
}
