package com.nottnott.app.oopdesign.pattern.adapter;

public class ClassAdapter extends LegacyApi implements Api {
  @Override
  public void api() {
    super.oldApi();
  }
}
