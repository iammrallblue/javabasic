package org.javabasic.d10codes.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

  @Override
  public void absMethod() {
    System.out.println("I am an overrode method. B");
  }

  // override default method from Interface.
  @Override
  public void defaultMethod() {
    System.out.println("I am an overrode default method in implementation class.");
  }
}
