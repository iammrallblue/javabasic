package org.javabasic.d09codes.demo11;

/*
  1. MUST create object of Subclass 
      to use abstract class.
  2. 
  *** IMPORTANT:
        Abstract class CANNOT be instantiated.
        MUST use object of Subclass
        Animal animal = new Animal(); // ERROR.
*/
public class Demo10AbstractClass {
  /** Demo of abstract class. */
  public static void main(String[] args) {
    // create object of Cat class.
    Cat cat = new Cat();
    cat.eat();
    cat.normalMethod();
  }
}
