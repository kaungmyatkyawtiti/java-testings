package com.nottnott.app.oopdesign.pattern.memento;

public class Originator {
  String state;

  public void setState(String state) {
    System.out.println("Originator setting state " + state);
    this.state = state;
  }

  public Memento saveToMemento() {
    System.out.println("Originator saving to memento");
    return new Memento(this.state);
  }

  public void restoreFromMemento(Memento memento) {
    this.state = memento.getSavedState();
    System.out.println("Originator state after restoring from memento " + this.state);
  }
}
