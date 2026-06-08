package com.nottnott.app.oopdesign.pattern.state;

public class HungryState implements State {
  @Override
  public void doAction(StateContext context) {
    System.out.println("I am hungry");
    context.changeState(new EatingState());
  }
}

class EatingState implements State {
  @Override
  public void doAction(StateContext context) {
    System.out.println("I am eating");
    context.changeState(new FullState());
  }
}

class FullState implements State {
  @Override
  public void doAction(StateContext context) {
    System.out.println("I am full");
  }
}
