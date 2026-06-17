package com.nottnott.app.oopdesign.pattern.iterator;

public class WordArrayIterator implements Iterable<String> {
  String[] sentence;

  WordArrayIterator(String[] sentence) {
    this.sentence = sentence;
  }

  @Override
  public Iterator<String> createIterator() {
    return new SentenceIterator();
  }

  public class SentenceIterator implements Iterator<String> {
    String[] words;
    int index = 0;

    SentenceIterator() {
      this.words = sentence;
    }

    @Override
    public boolean hasMore() {
      return index < words.length;
    }

    @Override
    public String next() {
      return words[this.index++];
    }
  }
}
