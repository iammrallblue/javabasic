package org.javabasic.d05codes.demo01;

/*
  How to access the element of an Array.
    access an array element by referring to the index number
      arrayName[index], index is an int number and starts from 0.
    
  to print out the name of Array, will get result like memory hashcode.

    Binary: 0,1
    Decimal: 0123456789
    Hex: 0123456789abcdef
*/
public class Demo04Array {
  /** access elements of an Array. */
  public static void main(String[] args) {
    // print out the memory hashcode of an array
    int[] intArray = { 1, 2, 3, 5, 6 };
    System.out.println(intArray); // [I@2a139a55
    // System.out.println(intArray.toString()); // [I@2a139a55

    // access element in Array intArray
    System.out.println(intArray[0]); // 1

    // assign element to a variable
    int x = intArray[2];
    int y = intArray[4];
    System.out.println(x * y);
  } // main
}
