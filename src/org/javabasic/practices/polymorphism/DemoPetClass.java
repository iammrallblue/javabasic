package org.javabasic.practices.polymorphism;

public class DemoPetClass {
  /** Demo of Pet Class. */
  public static void main(String[] args) {
    // Owner needs to feed pets
    /*Owner owner = new Owner();
    owner.feeding(new Cat());
    // Pet pet = new Cat()
    // new Cat() is polymorphism.

    owner.feeding(new Dog());
    // Pet pet = new Dog();
    // new Dog() is polymorphism. */

    // call unique method from Dog and Cat Classes by polymorphism
    Pet cat = new Cat(); // upcasting in polymorphism
    cat.eat(); // method eat overrode in subclass Cat, therefore, can access it

    // catchMouse is the unique method of Cat class.
    // cat.catchMouse();
    // catchMouse() is undefined for the type Pet, b/c it belongs to Cat class.

    // if Pet cat wants to access the unique method in Cat class
    // it needs to downcasting 
    Cat cat2 = (Cat) cat;
    cat2.catchMouse();
  } // main
}
