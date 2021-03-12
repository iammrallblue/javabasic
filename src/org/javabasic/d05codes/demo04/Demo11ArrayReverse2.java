package org.javabasic.d05codes.demo04;

/*
  Array can be a parameter for methods, but methods received the memory address of the array
  not the contents of an array. 

  three factors of self-defined method:
    1. return value, or void return value.
    2. method name
    3. argument list
    (see printArray())

  *** IMPORTANT: (as we see the method printArray(int[] tempArray))
      1. when array used as a parameter passing to method printArray(), 
         the value passed in to method printArray() is memory hashcode(memory address);
*/
public class Demo11ArrayReverse2 {
  /** Demo of reversing array. */
  public static void main(String[] args) {
    int[] intArray = { 3, 4, 6, 7, 11, 24, 23, 12, 89 };
    System.out.println("the original array is: ");
    printArray(intArray);
    System.out.println("\nmemory hashcode of intArray is: " + intArray); // [I@2a139a55
    // to reverse the original array
    for (int left = 0, right = intArray.length - 1; left < right; left++, right--) {
      int temp = intArray[left];
      intArray[left] = intArray[right];
      intArray[right] = temp;
    }
    System.out.println("\nthe reversed array is: ");
    printArray(intArray);
  } // main

  /** to declare a method for printing array. */
  public static void printArray(int[] tempArray) { // tempArray received: [I@2a139a55
    // System.out.println("tempArray received the memory hashcode is: " + tempArray);
    // to iterate an array we need a for loop
    for (int i = 0; i < tempArray.length; i++) {
      System.out.print(tempArray[i] + ", ");
    }
  }
}
