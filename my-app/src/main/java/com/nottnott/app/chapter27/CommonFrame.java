package com.nottnott.app.chapter27;

import java.awt.Toolkit;

import javax.swing.JFrame;

public abstract class CommonFrame extends JFrame {
  CommonFrame() {
    super("Hello World");
    this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.initComponent();

    this.setVisible(true);
  }

  public abstract void initComponent();
}
