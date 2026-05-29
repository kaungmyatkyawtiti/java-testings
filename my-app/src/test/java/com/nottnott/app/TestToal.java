package com.nottnott.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nottnott.app.unitest.Total;

public class TestToal {
  @Test
  public void testSum() {
    Total obj = new Total();
    int result = obj.sum(1, 2, 3);
    assertEquals(6, result);
  }
}
