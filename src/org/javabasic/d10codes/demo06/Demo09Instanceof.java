package org.javabasic.d10codes.demo06;

/*
  Keyword instanceof:
    is used for checking if a reference variable is 
    containing a given type of object reference or not.
    Key point:
      instanceof:
        object instanceof className;
        animal instanceof Dog;
        return a boolean value.
    Issus Description:
      When sometime using the specified method from Subclass.
      an object needs downcasting. before doing downcasting
      using instanceof to check what the object really is.
      to void a ClassCastException Error.
      Solution:
        using instanceof keyword
*/
public class Demo09Instanceof {
  /** Demo of keyword instanceof. */
  public static void main(String[] args) {
    // using polymorphism to create a cat object
    Animal animal = new Cat();
    animal.eat();

    // using instanceof keyword
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.protectingHouse();
    }
    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      cat.catcher();
    }

    // calling method to use instanceof
    Animal dog = new Dog();
    checkPet(dog);
  } // main

  /** method check a pet is dog or cat. */
  public static void checkPet(Animal pet) {
    if (pet instanceof Dog) {
      Dog dog = (Dog) pet;
      dog.protectingHouse();
    }
    if (pet instanceof Cat) {
      Cat cat = (Cat) pet;
      cat.catcher();
    }
  }
}
