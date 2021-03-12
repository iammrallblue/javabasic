package org.javabasic.d09codes.demo08;

public class Subclass extends Superclass {
  // fields
  int num = 10;

  /** Constructor. */
  public Subclass() {
    // Subclass() calls Subclass(int x) with this
    this(233);
    // this(2,3); // ERROR
  }

  public Subclass(int x) {
    System.out.println(x);
  }

  public Subclass(int x, int y) {

  }

  /** super and this. */
  public void method() {
    // local variable
    int num = 20;
    System.out.println("local variable: " + num);
    System.out.println("the current class' variable: " + this.num);
    System.out.println("the superclass' variable: " + super.num);
  }

  public void methodA() {
    System.out.println("called methodA().");
  }

  /** calling method with this. */
  public void methodB() {
    // calls method with this. to emphasize the method is 
    // belonged to the current class
    this.methodA();
    System.out.println("called methodB()");
  }
}
