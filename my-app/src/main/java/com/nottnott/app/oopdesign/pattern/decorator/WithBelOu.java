package com.nottnott.app.oopdesign.pattern.decorator;

public class WithBelOu implements MoHinGa {
  MoHinGa moHinGa;

  WithBelOu(MoHinGa moHinGa) {
    this.moHinGa = moHinGa;
  }

  @Override
  public String prepare() {
    return this.moHinGa.prepare() + "with BelOu ";
  }
}
