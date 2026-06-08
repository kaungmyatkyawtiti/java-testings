package com.nottnott.app.oopdesign.pattern.flyweight;

import java.util.HashMap;

public class PlatformFlyweight {
  static HashMap<String, Platform> cache = new HashMap<>();

  public static Platform getInstance(String platformType) {
    Platform p = cache.get(platformType);

    if (p == null) {
      switch (platformType) {
        case "DotNet":
          p = new DotNetCLR();
          break;
        case "Java":
          p = new JVM();
          break;
      }
      cache.put(platformType, p);
    }
    return p;
  }
}
