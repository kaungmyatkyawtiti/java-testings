package com.nottnott.app.oopdesign.pattern.iterator;

public interface Iterator<T> {
  boolean hasMore();

  T next();
}
