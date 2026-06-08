package com.nottnott.app.oopdesign.pattern.observerobserable;

import java.util.ArrayList;

public class Model implements Publisher {
  ArrayList<Subscriber> subscribers = new ArrayList<>();

  public void addSubscriber(Subscriber sub) {
    this.subscribers.add(sub);
  }

  public void removeSubscriber(Subscriber sub) {
    this.subscribers.remove(sub);
  }

  @Override
  public void notifySubscriber(String data) {
    for (Subscriber sub : this.subscribers) {
      sub.update(data);
    }
  }

}
