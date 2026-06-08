package com.nottnott.app.oopdesign.pattern.adapter;

public class ObjectAdapter implements Api {
  LegacyApi legacy = new LegacyApi();

  @Override
  public void api() {
    this.legacy.oldApi();
  }
}
