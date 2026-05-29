package com.nottnott.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nottnott.app.chapter6.Stack;

public class TestStack {
  @Test
  public void testPush() {
    // Arrange
    Stack stack = new Stack();

    // Act
    stack.push(10);
    stack.push(20);
    stack.push(30);

    // stack.pop();

    // Assert
    assertEquals(3, stack.size());
  }

  @Test
  public void testPop() {
    // Arrange
    Stack stack = new Stack();

    // Act
    stack.push(10);
    stack.push(20);
    stack.push(30);

    stack.pop();
    stack.pop();

    // Assert
    assertEquals(1, stack.size());
  }

}
