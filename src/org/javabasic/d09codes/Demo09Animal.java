package org.javabasic.d09codes;

public class Demo09Animal {
  
  /** Abstract Class and Abstract Method. */
  public static void main(String[] args) {
    //Animal animal = new Animal(); 
    // CANNOT instantiate Abstract Class Animal.

    Cat cat = new Cat();
    cat.eat();
  } // main
}
