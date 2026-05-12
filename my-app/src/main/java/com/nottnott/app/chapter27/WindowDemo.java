package com.nottnott.app.chapter27;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowDemo extends JFrame implements ActionListener {
  WindowDemo() {
    super("Hello World");
    this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fonts = ge.getAvailableFontFamilyNames();
    for (String font : fonts) {
      System.out.println("Font " + font);
    }
    this.initComponent();

    this.setVisible(true);
  }

  void initComponent() {
    this.setLayout(new FlowLayout());
    JLabel lblName = new JLabel("One");
    this.add(lblName);
    this.add(new JLabel("Two"));
    this.add(new JLabel("Three"));

    JButton btnOk = new JButton("Ok");
    // btnOk.addActionListener(this);
    btnOk.addActionListener(ae -> System.out.println("Btn ok click"));
    this.add(btnOk);

    Button btnCancel = new Button("Cancel");
    btnCancel.addActionListener(this);
    this.add(btnCancel);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Action perform " + e.getActionCommand());
    String command = e.getActionCommand();
    switch (command) {
      case "Ok":
        System.out.println("Click btn Ok");
        break;
      case "Cancel":
        System.out.println("Click btn Cancel");
    }
  }

  // public void paint(Graphics g) {
  // System.out.println("Paint");
  // Font myFont = new Font("Inter", Font.BOLD, 40);
  // g.setFont(myFont);
  //
  // Dimension screenSize = this.getSize();
  // g.drawString("Hello World", screenSize.width / 2, screenSize.height / 2);
  // this.setBackground(Color.GRAY);
  // this.setForeground(Color.BLUE);
  // g.drawLine(20, 20, 100, 0);
  // g.drawArc(100, 200, 50, 50, 0, 360);
  // }

  public static void main(String[] args) {
    new WindowDemo();
  }
}
