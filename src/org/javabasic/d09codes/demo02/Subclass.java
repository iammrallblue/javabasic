package org.javabasic.d09codes.demo02;

public class Subclass extends Superclass {
  // instance variables
  int subNum = 20;
  int number = 200;

  // Subclass' method using variable in this Class
  public void subMethod() {
    System.out.println(number);
    // prefer to use number from this Class
  }
}
