package org.javabasic.d10codes.demo06;

/*
  Upcasting and Downcasting of Object:
    1. Run time Polymorphism is object upcasting
        Animal animal = new Cat();
 
  Key point:
    1. Upcasting of an Object is SAFE, 
        it is kind of casting from small to large.
    2. when the object is upcasting to the reference Superclass, 
        the object cannot use special methods and variables in its class.
        (see animal catcher()), method catcher() is from Subclass Cat.
  Issue Description:
    When object is in upcasting. the object ONLY can use method from its Superclass.
    it's kind of a cat turns into an animal.
    solution:
      object can be downcasting to its reference type class.
      format:
        Cat cat = (Cat) animal;
      then call method() from Cat class.
      cat.catcher();
*/
public class Demo08ObjectUpcasting {
  /** Demo of object upcasting. */
  public static void main(String[] args) {

    // object upcasting.
    Animal animal = new Cat();
    animal.eat();

    // cannot use its own method, how to solve it.
    // animal.catcher(); //

    // downcasting can solve after object upcasting
    // cannot use its own methods
    Cat cat = (Cat) animal;
    cat.catcher();
  } // main
}
