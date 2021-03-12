package org.javabasic.d09codes.demo07;

public class Subclass extends Superclass {
  
  /** Demo of call Superclass constructors.*/
  public Subclass() {
    // super(); // call non-parameterized superclass constructor
    super(3); // call parameterized superclass constructor.
    System.out.println("Subclass Constructor.");
  }
}
