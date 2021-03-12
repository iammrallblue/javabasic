package org.javabasic.d09codes.demo05;

public class Subclass extends Superclass {
  // override Superclass method
  @Override
  public void method() {
    System.out.println("method is overridden in Subclass.");
  }

  @Override
  public String superMethod() {
    return "Hello,Bella.";
  }
}
