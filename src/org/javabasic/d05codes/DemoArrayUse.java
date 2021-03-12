package org.javabasic.d05codes;

public class DemoArrayUse {
  /** Array use. */
  public static void main(String[] args) {
    int[] intArray = { 10, 20, 30 };
    System.out.println(intArray); // [I@6504e3b2 -> Memory Address.

    // index of an array. starts from 0 to n
    // print out a specific value
    System.out.print("directly using array's index to withdraw a value from Array: ");
    System.out.println(intArray[0]); // value is 10

    // assign value from intArray to a variable
    int var = intArray[1];
    System.out.print("Assign an element of an Array to a variable: ");
    System.out.println(var);

    // create a dynamic array, length is 3
    int[] intArray2 = new int[3];
    System.out.println(intArray2); // -> Memory Address,[I@379619aa
    System.out.println(intArray2[0]); // 0, 0 is default value for int.
    System.out.println(intArray2[1]); // 0
    System.out.println(intArray2[2]); // 0

    // A dynamic array has the default values for all types.
    // Integer, the default value is 0.
    // Double, the default value is 0.0
    // Character, the default value is '\u0000';
    // Boolean, the default value is false;
    // Reference Datatype, the default is null;

    System.out.println("---------Assign a value to element of array: ------------");

    // to access element of Array, assign a value to it.
    intArray2[1] = 123;
    System.out.println(intArray2[0]);
    System.out.println(intArray2[1]);
    System.out.println(intArray2[2]);

    // NOTICE: A static array has default value as well, but the default value will
    // be replaced by values inside of the big bracket.
  }
}