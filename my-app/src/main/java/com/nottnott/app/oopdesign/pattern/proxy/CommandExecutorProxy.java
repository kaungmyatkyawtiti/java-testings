package com.nottnott.app.oopdesign.pattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {
  private boolean isAdmin;
  private CommandExecutor executor;

  CommandExecutorProxy(String user, String pwd) {
    if ("admin".equals(user) && "admin".equals(pwd)) {
      isAdmin = true;
    }
    executor = new CommandExecutorImpl();
  }

  @Override
  public void runCommand(String cmd) throws Exception {
    if (isAdmin) {
      executor.runCommand(cmd);
    } else {
      if (cmd.trim().startsWith("rm")) {
        throw new Exception("rm command is not allowed for non-admin users");
      } else {
        executor.runCommand(cmd);
      }
    }
  }
}
