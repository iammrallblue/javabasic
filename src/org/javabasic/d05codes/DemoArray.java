package org.javabasic.d05codes;

// Array is a container, it stores many values but the datatype MUST be same.
// Array is reference data type
// The length of Array can not change during the program executing.
public class DemoArray {
  /** Dynamic Array. */
  public static void main(String[] args) {

    // create a dynamic array
    int[] intArray = new int[100]; // the length of array is 100

    intArray.toString();

    double[] doubleArray = new double[10]; // the length of array is 10
    doubleArray.toString();

    String[] stringArray = new String[5]; // length is 5
    stringArray.toString();

    int[] intArray5;
    intArray5 = new int[10];
    intArray5.toString();
    // intArray, doubleArray, and stringArray are called dynamic array. b/c the
    // length of them is changeable.

    // create a static array (2 forms )
    // 1st form of a static array
    // a static array directly has value in the big bracket.
    int[] intArray1 = new int[] { 5, 15, 25, 35, 45, 55 }; // the length of array is 6
    intArray1.toString();

    // 2nd form of a static array (this form can NOT split into two part)
    int[] intArray2 = { 1, 2, 3, 4, 5, 6 }; // length is 6
    intArray2.toString();

    // split a dynamic array into two parts
    int[] array3;
    array3 = new int[] { 1, 2, 3, 4, 5 };
    array3.toString();

    // it's wrong to split a static array
    /*
     * int[] int Array4; Array4 = {1,2,3,4};
     */

    String[] stringArray1 = new String[] { "Hello", "Hey", "Hola", "Aloha" };
    stringArray1.toString();

    // when can use a dynamic, when can use a static array?
    // if the length of array is specified, then a static array can be used.
    // if the length of array is NOT specified, then a dynamic array can be used.
  }
}