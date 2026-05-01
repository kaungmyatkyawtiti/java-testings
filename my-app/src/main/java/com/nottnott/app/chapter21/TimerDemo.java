package com.nottnott.app.chapter21;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
  @Override
  public void run() {
    System.out.println("Task run " + new Date());
  }
}

public class TimerDemo {
  public static void main(String[] args) {
    MyTask task = new MyTask();
    Timer myTimer = new Timer();
    myTimer.schedule(task, 1000);
    try {
      Thread.sleep(6000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    task.cancel();
  }
}
