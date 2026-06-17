package com.nottnott.app.oopdesign.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
  List<ChatUser> users = new ArrayList<>();

  public void joinChat(ChatUser user) {
    this.users.add(user);
  }

  public void leaveChat(ChatUser user) {
    this.users.remove(user);
  }

  public void sendMessage(ChatUser sender, String message) {
    for (ChatUser user : this.users) {
      if (sender != user) {
        user.receive(message);
      }
    }
  }
}
