package org.javabasic.practices.polymorphism;

/*
  A Subclass Dog
    // instance method
    @override
    void eat() {}
*/
public class Dog extends Pet {
  // fields

  // instance method
  @Override
  public void eat() {
    System.out.println("method eat() overrode in Dog class.");
    System.out.println("bones lover.");
  }

  public void catchFrisbee() {
    System.out.println("Dog's unique method catchFrisbee.");
    System.out.println("Dog's is playing frisbee with owner.");
  }
}