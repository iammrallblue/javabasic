package org.javabasic.practices.polymorphism;

/*
  A Owner Class for Pets

    method feeding is method overload.
*/
public class Owner {
  // fields

  // instance method
  // method feeding with Cat as parameter
  /*
   * public void feeding(Cat cat) { cat.eat(); }
   * 
   * // method feeding with Dog as parameter public void feeding(Dog dog) {
   * dog.eat(); }
   */

  /**
   * feeding method defined as (Pet pet) method to implement polymorphism 
   * Pet pet = new Dog(), and Pet pet = new Cat()in DemoPetClass.java
   */
  public void feeding(Pet pet) {
    pet.eat();
    // pet.eat() prior to call overrode method eat in each
    // subclass but not the method eat() in Superclass Pet.
  }
}
