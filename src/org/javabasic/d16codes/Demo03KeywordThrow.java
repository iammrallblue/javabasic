package org.javabasic.d16codes;

/*
  Keyword Throw:
    for throwing out Exceptions from specified methods.

    Format:
      throw new xxxException("causes of Exception.")
    
    NOTICE:
      1. throw MUST be declared inside of method body
      2. the new object after throw keyword MUST be the 
        object of Exception or subclasses of Exception.
        or MUST be the object of RuntimeException or its subclasses.
      3. the Exceptions which throwing out by keyword throw
          MUST be handled or handled default by JVM.
*/
public class Demo03KeywordThrow {
  /** throwing Exceptions to JVM. */
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6 };
    int element = getElement(array, 5);
    System.out.println(element);
  } // main

  /**
   * a method for getting element by specified index. parameters: int[] array, int
   * index. NullPointerException is a RuntimeException, JVM will default handle it
   */
  public static int getElement(int[] array, int index) {

    // validates if array is empty
    if (array == null) {
      throw new NullPointerException();
    }
    // validates if index is within the range of the array's index
    if (index < 0 || index > array.length - 1) {
      throw new ArrayIndexOutOfBoundsException("out of range.");
    }
    int element = array[index];
    return element;
  }
}
