package org.javabasic.d16codes;

/*
  How are Exceptions produce?
  how do solve exceptions?


  Analyzing ArrayIndexOutOfBoundsException:
    when array[index] requires index 3, JVM will detect
    Exception that index 3 does not existed, ArrayIndexOutOfBoundsException
      2 things JVM will do:
        1. JVM will produce an object of Exception according to cause.
            the object will consist of content, cause, and position.
              new ArrayIndexOutOfBoundsException("3");
        2. in method getElement() does not contain exception-processing logic (like try...catch)
            therefore, JVM will share the object of Exception to the main method 
            to solve the Exception.
*/
public class Demo02Exception {
  /** . */
  public static void main(String[] args) {
    int[] array = { 1, 2, 3 };
    // JVM gives out object of Exception, new ArrayIndexOutOfBoundsException("3");
    int element = getElement(array, 3);
    System.out.println(element); // java.lang.ArrayIndexOutOfBoundsException:
  } // main

  // method for getting element by index.
  public static int getElement(int[] array, int index) {
    int element = array[index];
    return element;
  }
}
