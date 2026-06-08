package com.nottnott.app.oopdesign.pattern.state;

public class StateContext {
  State currentState;

  public StateContext(State initial) {
    this.currentState = initial;
  }

  public void changeState(State newState) {
    this.currentState = newState;
  }

  public void doAction() {
    this.currentState.doAction(this);
  }
}
