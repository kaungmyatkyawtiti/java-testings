package com.nottnott.app.oopdesign.pattern.mediator;

public class User implements ChatUser {
  String name;
  ChatMediator mediator;

  User(String name, ChatMediator mediator) {
    this.name = name;
    this.mediator = mediator;
    this.mediator.joinChat(this);
  }

  @Override
  public void receive(String message) {
    System.out.println("User " + this.name + " got a message " + message);
  }

  @Override
  public void send(String message) {
    this.mediator.sendMessage(this, message);
  }
}
