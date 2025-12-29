package com.nottnott.app.chapter6;

/**
 * StackOOP
 */
public class Stack {
  int top = -1;
  int[] stack = new int[10];

  void push(int item) {
    this.stack[++this.top] = item;
  }

  int pop() {
    return this.stack[this.top--];
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack.pop());

    Stack stack2 = new Stack();
    stack2.push(50);
    stack2.push(100);
    System.out.println(stack2.pop());
  }
}
