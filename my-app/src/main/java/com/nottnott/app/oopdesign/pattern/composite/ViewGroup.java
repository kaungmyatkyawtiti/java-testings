package com.nottnott.app.oopdesign.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends UIWidget {
  List<UIWidget> children = new ArrayList<>();

  ViewGroup(String name) {
    super(name);
  }

  public void addChild(UIWidget widget) {
    this.children.add(widget);
  }

  @Override
  void paint() {
    System.out.println("Paint " + this.name);
    for (UIWidget widget : this.children) {
      widget.paint();
    }
  }
}
