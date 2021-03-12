package org.javabasic.d10codes.demo05;

/*
   Using Fields (instance variables) in Polymorphism:
    Key point:
      1. instance variable CANNOT be overridden.
    
    Tips of using instance variable (constant)
      1. access instance variable by the object name
          spc.num
      2. access instance variable by calling instance methods.
    Issus Description:
      When Superclass and Subclass have same name variables.
      Solution:
        1. If access by object name, will call variable in
            Superclass. (see sbc.num)
        2. If access variable by calling method, If Subclass
            does not override the method, it will call
            method in Superclass. If Subclass override the method
            , it will call overrode method.
            
*/
public class Demo08PolymorphismField {
  /** Demo of instance variables in polymorphism. */
  public static void main(String[] args) {
    // Using polymorphism
    Subclass sbc = new Subclass();
    System.out.println("num:" + sbc.num); // num is 10;

    // System.out.println("Subclass does not override method:");
    // sbc.printNumber(); // 10 

    System.out.println("Subclass overrode printNumber() method.");
    sbc.printNumber();
  } // main
}
