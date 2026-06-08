package com.nottnott.app.oopdesign.pattern.command;

public class CopyCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Copy executed");
  }
}
