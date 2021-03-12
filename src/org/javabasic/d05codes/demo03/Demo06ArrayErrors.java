package org.javabasic.d05codes.demo03;

/*
  ERRORS of Array:
    1. java.lang.ArrayIndexOutOfBoundsException;
      it means the access element might not exist, out of the length of Array
    2. java.lang.NullPointerException;
      it means the array might be empty or needs to be initialized.
      *** All Reference types can assign a null value. but
          might throw the exception, NullPointerException
*/
public class Demo06ArrayErrors {
  /** Demo of Array Exceptions. */
  public static void main(String[] args) {
    int[] intArray = { 15, 25, 35 };
    System.out.println(intArray[0]); // 15
    System.out.println(intArray[1]); // 25
    System.out.println(intArray[2]); // 35
    // ArrayIndexOutOfBoundsException
    // System.out.println(intArray[3]); 
    // the Array's length is only 3, [3] is 4th element.
    // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    System.out.println("------2nd ERROR ----------");
    int[] intArray2 = null; // all references can be assigned value null;
    // System.out.println(intArray2[0]); 
    // ERROR, java.lang.NullPointerException
    // 1st, [0] is empty, 2nd intArray2 needs to be initialized.
    
    // solve NullPointerException, to initialized the array.
    intArray2 = new int[5];
    System.out.println(intArray2[0]);
  }
}