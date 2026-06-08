package com.nottnott.app.oopdesign.pattern.observerobserable;

public class PublisherSubscriberDemo {
  public static void main(String[] args) {
    Model model = new Model();

    View view1 = new View("View 1");
    View view2 = new View("View 2");
    View view3 = new View("View 3");

    model.addSubscriber(view1);
    model.addSubscriber(view2);
    model.addSubscriber(view3);

    model.notifySubscriber("Model change");

    model.removeSubscriber(view2);
    model.notifySubscriber("Change2");
  }
}
