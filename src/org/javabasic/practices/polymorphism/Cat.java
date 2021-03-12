package org.javabasic.practices.polymorphism;

/*
  A Subclass Cat extends from Class Pet

    // instance method
    @override
    void eat() {}
*/
public class Cat extends Pet {
  // fields

  // instance method
  @Override
  public void eat() {
    System.out.println("method overrode in Cat class.");
    System.out.println("fish lover,");
  }

  public void catchMouse() {
    System.out.println("Cat's unique method catchMouse.");
    System.out.println("Cat's playing with mice.");
  }
}
