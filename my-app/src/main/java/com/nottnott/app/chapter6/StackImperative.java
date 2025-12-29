package com.nottnott.app.chapter6;

/**
 * StackImperative
 */
public class StackImperative {

  static int push(int[] stack, int top, int item) {
    stack[++top] = item;
    return top;
  }

  public static void main(String[] args) {
    int top = -1;
    int stack[] = new int[10];

    top = push(stack, top, 10);
    System.out.println("stack " + stack[0]);
    System.out.println("top " + top);

    top = push(stack, top, 20);
    System.out.println("stack " + stack[1]);
    System.out.println("top " + top);

    int top2 = -1;
    int stack2[] = new int[10];

    top2 = push(stack2, top, 10);
    System.out.println("stack2 " + stack2[0]);
  }
}
