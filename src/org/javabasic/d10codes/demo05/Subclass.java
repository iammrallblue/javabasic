package org.javabasic.d10codes.demo05;

public class Subclass extends Superclass {
  int num = 20;

  @Override
  public void printNumber() {
    System.out.println("num is: " + num);
  }

  @Override
  public void method() {
    System.out.println("override method() of Superclass in Subclass.");
  }

  public void subMethod() {
    System.out.println("special method of Subclass.");
  }
}
