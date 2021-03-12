package org.javabasic.d05codes.demo02;

/*
  access element of a dynamic array

  in the dynamic array, all elements will have default value.
  example:
    byte/short/int/long
      will have default value 0;
    double/float
      will have default value 0.0;
    char
      will have default value '\u0000';
    boolean
      will have default value false;
    reference type
      will have default value null;
  NOTICE:
    A static array has default value as well, 
    the default value is replaced by (JVM) system, when the array
    is defined as a static.
*/
public class Demo05Array {
  /** access element of array. */
  public static void main(String[] args) {
    // a dynamic array
    int[] array = new int[4];

    // print out the memory hashcode of array
    System.out.println(array);
    // print out all elements
    System.out.println(array[0]); // 0
    System.out.println(array[1]); // 0
    System.out.println(array[2]); // 0
    System.out.println(array[3]); // 0
    // since the content in the array is not specified.
    // therefore, the given result is 0, and 0 is default value.

    // assign value to an element array[1]
    array[1] = 100;
    array[3] = 200;
    System.out.println(array[0]); // 0
    System.out.println(array[1]); // 100
    System.out.println(array[2]); // 0
    System.out.println(array[3]); // 200
  } // main
}
