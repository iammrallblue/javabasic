package org.javabasic.d09codes.demo11;

/*
  Abstract Class and Abstract Method:
  
  Abstract Class:
    Format:
      public abstract class Animal {

      }
  Abstract Method:
    Format:
      public abstract void method(); no bracket.
    
  Key point:
    1. Abstract method ONLY can declare in Abstract Class.
    2. Abstract class can have normal methods as well.

    Usage of Abstract Class and Abstract Method:
      1. CANNOT directly create an Object of Abstract Class.
      2. MUST use a Subclass to inherit Abstract Class.
      3. The Subclass MUST override all abstract methods from Abstract Class.
        Format;
          @Override
          public void eat() {
            // must have body of method.
          }
      4. create object of Subclass to use all abstract methods from the abstract class.
*/
// an abstract Class Animal
public abstract class Animal {

  public Animal() {
    // abstract class can have constructors
    System.out.println("Constructor of Subclass (Abstract Class) is called.");
  }

  // an abstract method named eat, but not to sure what to eat.
  public abstract void eat();

  // instance method
  public void normalMethod() {
    System.out.println("a normal method in abstract class Animal.");
  }
}
