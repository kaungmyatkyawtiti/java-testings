package com.nottnott.app.chapter27;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class CheckBoxDemo extends CommonFrame {
  @Override
  public void initComponent() {
    this.setLayout(new FlowLayout());

    CheckboxGroup cbGroup = new CheckboxGroup();

    JLabel lblMale = new JLabel("Male");
    // this.add(lblMale);

    Checkbox chkMale = new Checkbox("Male", cbGroup, false);
    this.add(chkMale);
    chkMale.addItemListener(ev -> {
      System.out.println("Male checkbox click " + ev.getStateChange());
    });

    JLabel lblFemale = new JLabel("Female");
    // this.add(lblFemale);

    Checkbox chkFemale = new Checkbox("Female", cbGroup, false);
    this.add(chkFemale);
    chkFemale.addItemListener(ev -> {
      System.out.println("Female checkbox click " + ev.getStateChange());
    });
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new CheckBoxDemo();
      }
    });
  }
}
