package com.nottnott.app.oopdesign.pattern.flyweight;

public class DotNetCLR implements Platform {
  public DotNetCLR() {
    System.out.println("Create DotNet ClR");
  }

  @Override
  public void execute(Code code) {
    System.out.println("Dotnet executed code " + code.getCode());
  }
}
