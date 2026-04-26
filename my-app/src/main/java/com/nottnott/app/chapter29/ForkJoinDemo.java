package com.nottnott.app.chapter29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SqrlTransform extends RecursiveAction {
  int TRESHOLD = 10000;
  double data[];
  int start, end;

  SqrlTransform(double[] data, int start, int end) {
    System.out.println("New SqrlTransform start " + start + " end " + end);
    this.data = data;
    this.start = start;
    this.end = end;
  }

  @Override
  protected void compute() {
    if ((end - start) < TRESHOLD) {
      for (int i = start; i < end; i++) {
        this.data[i] = Math.sqrt(data[i]);
      }
    } else {
      int middle = (start + end) / 2;
      invokeAll(
          new SqrlTransform(data, start, middle),
          new SqrlTransform(data, middle, end));

    }
  }
}

public class ForkJoinDemo {
  public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool();
    double data[] = new double[10_000];
    for (int i = 0; i < 10_000; i++) {
      data[i] = i;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(" " + data[i]);
    }
    System.out.println("");

    SqrlTransform task = new SqrlTransform(data, 0, data.length);
    pool.invoke(task);

    for (int i = 0; i < 10; i++) {
      System.out.println("" + data[i]);
    }
    System.out.println("");

  }
}
