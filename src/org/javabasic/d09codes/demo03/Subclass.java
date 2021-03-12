package org.javabasic.d09codes.demo03;

/*
  A Subclass.
*/
public class Subclass extends Superclass {
  // field
  int num = 20;

  /** instance method. */
  public void subMethod() {
    // local variable.
    int num = 30;
    System.out.println("local variable in Subclass: " + num);
    System.out.println("instance variable in Subclass: " + this.num);
    System.out.println("instance variable in Superclass: " + super.num);
  }
}
