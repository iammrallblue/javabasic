package org.javabasic.d05codes.demo03;

/*
  to get length of an Array:
    arrayName.length; 
  
  number inside [] is the length of array

  when new array is created in heap, it will never changed.
*/
public class Demo07ArrayLength {
  /** Demo of finding length of an Array. */
  public static void main(String[] args) {
    int[] intArray = new int[3]; // easy to find out the length
    System.out.println(intArray);

    int[] intArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 }; 
    // not easy to find out the length

    // to find the length of intArray2
    int length = intArray2.length;

    System.out.println("The intArray2's length is: " + length);

    // When the array is created, the length can NEVER change. only the memory
    // address changes.
    int[] intArray3 = new int[3]; // the length of intArray3 is 3.
    System.out.println("the length of intArray3 is: " + intArray3.length);

    // to initialized again the intArray3
    intArray3 = new int[5]; // the length of intArray3 is 5, b/c reinitialized the intArray3.
    System.out.println("The length of intArray3 is: " + intArray3.length);
    // therefore when array is reinitialized, the memory address changed. there are
    // 2 arrays and same name intArray3
    // intArray3 receives two times the array, one is length 3, other is length 5
  }
}