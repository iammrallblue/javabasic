package org.javabasic.d05codes.demo04;

/*
  example for reversing an array.

  three factors of method declaration: (see printMethod())
    1. return value_type
        since the example only needs to print out the array,
        no return value is required
    2. methodName()
        the method is for printing array
        the name can be printMethod()
    3. argument list:
        the method has to received the array which will be printed
        therefore, the argument should be an array (int[] array)
*/
public class Demo10ArrayReverse {
  /** Demo of reverse an array. */
  public static void main(String[] args) {
    // declare an array to be an original array
    int[] array = { 5, 6, 7, 8, 4, 3, 2, 1, 9 };
    // show memory hashcode of original array
    System.out.println("the memory hashcode of array is: " + array.toString()); // [I@2a139a55
    System.out.println("the original array is: ");
    // call printMethod() to print out original array
    printMethod(array);

    // reverse the original array
    // since require two indexes (indices)
    // initializing expression: int left = 0, int right = array.length -1
    // condition: left < right
    // iterating expression: left++, right--
    // body of loop: 3rd variable temp to storage values.
    for (int left = 0, right = array.length - 1; left < right; left++, right--) {
      // 3rd variable
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
    }

    System.out.println("the reversed array is: ");
    // call printMethod() to print out array
    printMethod(array);

    // print out array
    System.out.println("the memory hashcode of array is: " + array.toString());
  } // main

  /**
   * since the example has duplicate code for printing array therefore, we can
   * declare a printMethod() to brief code. Array can be a parameter for methods,
   * but methods received the memory hashcode of the array not the content of an
   * array.
   */
  public static void printMethod(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println();
  }
}