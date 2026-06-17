package com.nottnott.app.oopdesign.pattern.iterator;

public class WordIterator implements Iterable<String> {
  String sentence;

  WordIterator(String sentence) {
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
      this.words = sentence.split(" ");
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
