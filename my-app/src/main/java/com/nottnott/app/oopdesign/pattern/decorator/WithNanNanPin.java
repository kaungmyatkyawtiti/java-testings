package com.nottnott.app.oopdesign.pattern.decorator;

public class WithNanNanPin implements MoHinGa {
  MoHinGa moHinGa;

  WithNanNanPin(MoHinGa moHinGa) {
    this.moHinGa = moHinGa;
  }

  @Override
  public String prepare() {
    return this.moHinGa.prepare() + "with NanNanPin ";
  }
}
