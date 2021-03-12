package org.javabasic.d08codes.demo03;

public class MyClass {
  // data fields (instance variables)
  int num;
  static int numStatic;

  /** Instance variable access instance variable. */
  public void instanceMethod() {
    System.out.println("This is an instance method!");
    System.out.println(num);
    System.out.println(numStatic);
  } // instanceMethod

  /** an instance static method. 
   *  it belongs to the Class, not the Object of Class.
  */
  public static void staticInstanceMethod() {
    System.out.println("This is a static instance method!");

    // System.out.println(num); // ERROR, Static method can not access non-static
    // field (instance variable)

    // System.out.println(numStatic); // Static method can access static field
    // (instance variable)

    // Cannot use "this" inside of the static method.
  } // staticInstanceMethod

  // NOTICE: The Class needs to be instantiated then accessing the instance
  // method.
  // the static instance method can be directly using Class name to access
}