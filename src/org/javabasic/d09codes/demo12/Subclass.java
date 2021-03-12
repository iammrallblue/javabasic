package org.javabasic.d09codes.demo12;

/*
  inherited from an abstract superclass,
  overrode all abstract methods form abstract class.
*/
public class Subclass extends Superclass {
  // constructor
  public Subclass() {
    System.out.println("constructor of subclass.");
  }
  
  // abstract method from superclass
  @Override
  public void eat() {
    System.out.println("foodie loves eating.");
  }
}
