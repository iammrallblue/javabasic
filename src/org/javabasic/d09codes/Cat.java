package org.javabasic.d09codes;

/*
  A Subclass inherited from Superclass Animal.
*/
public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("Cats like fish.");
  }

  public void catcher() {
    System.out.println("Tom and Jerry.");
  }
}
