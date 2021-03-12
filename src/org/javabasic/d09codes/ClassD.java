package org.javabasic.d09codes;

public class ClassD extends ClassC {
  // data fields
  int number = 20;

  /** instance method. */
  public void subMethod() {
    int number = 30;
    System.out.println(number); // 30, directly using variable
    System.out.println(this.number); // 20 using keyword this.
    System.out.println(super.number); // 10 using keyword super.
  }
}
