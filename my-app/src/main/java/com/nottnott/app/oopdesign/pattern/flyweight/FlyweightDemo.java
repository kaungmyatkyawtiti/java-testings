package com.nottnott.app.oopdesign.pattern.flyweight;

public class FlyweightDemo {
  public static void main(String[] args) {
    Code code = new Code("1+2");

    Platform p = PlatformFlyweight.getInstance("DotNet");
    p.execute(code);

    p = PlatformFlyweight.getInstance("Java");
    p.execute(code);

    p = PlatformFlyweight.getInstance("DotNet");
    p.execute(code);
  }
}
