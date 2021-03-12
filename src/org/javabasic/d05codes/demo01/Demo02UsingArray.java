package org.javabasic.d05codes.demo01;

/*
  A static array: (it contains the specified content (datatype))
    1. it does not have number to tell the length of array
    2. can find the length of array by the specified elements in big{bracket}
    
    format:
      int[] intArray = new int[] {1,2,3,4,5....};
      or 
      int[] intArray = {1,2,3,4,5...};
      or 
      int[] intArray;
      intArray = new int[] {1,2,3,4,5...};
    TIPS:
      1. If the content is not specified, or certain,
        have to declare array as a dynamic array.
        int[] array = new int[3];
      2. If the content is specified,
        have to declare array as a static array.
        int[] array = new int[] {1,2,3...};
*/
public class Demo02UsingArray {
  /** Static initializing array. */
  public static void main(String[] args) {
    // static initializing Array
    // int[] array = new int[] {10,20,30};
    int[] array = { 10, 20, 30 };
    System.out.println(array); // Address value.
    System.out.println(array[0]); // ac

    // a string array, length is 3.
    String[] strArray;
    strArray = new String[] { "Hello", "Bella", "Jun" };
    System.out.println(strArray); // java.lang.String;@15db9742

    int value = array[1];
    System.out.println(value);
  } // main

}
