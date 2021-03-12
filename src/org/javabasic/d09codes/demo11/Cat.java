package org.javabasic.d09codes.demo11;

/*
  A Subclass inherited from the Abstract Class Animal
  Key point:
    1. inherited from Abstract class Animal.
    2. overrode all abstract methods from Animal class.
*/
public class Cat extends Animal {

  // constructor
  public Cat() {
    // super(), default to call the constructor of Subclass
    System.out.println("Constructor of Subclass is executed.");
  }
  
  @Override
  public void eat() {
    System.out.println("Cat can eat fish.");
  }
}
