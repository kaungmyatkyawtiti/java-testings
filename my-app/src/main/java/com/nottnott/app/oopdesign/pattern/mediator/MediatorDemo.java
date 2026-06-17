package com.nottnott.app.oopdesign.pattern.mediator;

public class MediatorDemo {
  public static void main(String[] args) {
    ChatMediator mediator = new ChatMediator();
    User user1 = new User("Nott Nott", mediator);
    User user2 = new User("Kaung Myat Kyaw", mediator);
    User user3 = new User("Ti Ti", mediator);

    user1.send("Hello from Nott Nott");
    user2.send("Hi from Kaung Myat Kyaw");
    user3.send("Hi from Ti Ti");
  }
}
