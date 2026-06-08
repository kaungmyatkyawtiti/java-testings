package com.nottnott.app.oopdesign.pattern.proxy;

public class ProxyDemo {
  public static void main(String[] args) throws Exception {
    CommandExecutor command = new CommandExecutorProxy("admin", "admin");
    command.runCommand("rm");

    command = new CommandExecutorProxy("admin", "user");
    command.runCommand("rm");
  }
}
