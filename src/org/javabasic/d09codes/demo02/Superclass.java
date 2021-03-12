package org.javabasic.d09codes.demo02;

public class Superclass {
  // instance variables
  int superNum = 10;
  int number = 100;

  /** instance method. */
  public void superMethod() {
    System.out.println(number);
    // prefer to use number from this Class.
  }
}
