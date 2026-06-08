package com.nottnott.app.oopdesign.pattern.command;

public class EditCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Edit executed");
  }
}
