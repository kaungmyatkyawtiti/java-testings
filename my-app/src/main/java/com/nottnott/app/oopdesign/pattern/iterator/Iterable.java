package com.nottnott.app.oopdesign.pattern.iterator;

public interface Iterable<T> {
  Iterator<T> createIterator();
}
