package com.nottnott.app.chapter21;

import java.util.BitSet;

public class BitSetDemo {
  public static void main(String[] args) {
    BitSet bitset = new BitSet(10);
    bitset.set(0);
    bitset.set(8);
    System.out.println("Bit set " + bitset);
  }
}
