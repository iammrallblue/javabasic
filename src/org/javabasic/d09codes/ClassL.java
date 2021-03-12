package org.javabasic.d09codes;

/*
  keyword super:
    1. access instance variables of Superclass inside of methods of Subclass.
    2. call instance methods of Superclass inside of methods of Subclass.
    3. call constructors of Superclass in the Subclass' constructors.

  A Subclass inherited from Superclass ClassK
*/
public class ClassL extends ClassK {
  // data fields
  int number = 20;

  // constructor
  public ClassL() {
    super(); // call Superclass' constructor
  }

  // instance methods
  public void subMethod() {
    System.out.println(super.number); // access Superclass' variable.
  }

  public void method() {
    super.method(); // call Superclass' method
    System.out.println("method in Subclass. ");
  }
}
