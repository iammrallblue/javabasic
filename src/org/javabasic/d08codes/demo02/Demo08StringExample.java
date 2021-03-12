package org.javabasic.d08codes.demo02;

/*
  Demo of String Class:
    to concat an int array with specified symbol, [1#2#3#...]
  
    Steps:
      1. declare an int Array
      2. declare a method to concat all elements in array.
        3-factors of method:
          1) return value, String
              since we want to return a string.
          2) method name,
              concatString()
          3) argument list
              we deal with an int array, therefore, parameter is an int array
      3. the format of return String [1#2#3#...]
          in method concatString(), using for loop to concat all elements with #
        
*/
// to concat all elements from a int[] array
public class Demo08StringExample {
  /** Demo of concat an int array to a String. */
  public static void main(String[] args) {
    int[] intArray = { 1, 2, 3, 4, 5, 6 };

    String result = concatString(intArray);
    System.out.println("result is: " + result);
  } // main

  /** A method to concat an int array to string. */
  public static String concatString(int[] tempArray) {
    String str = "[";
    for (int i = 0; i < tempArray.length; i++) {
      if (i == tempArray.length - 1) {
        str += "#" + tempArray[i] + "]";
      } else {
        str += "#" + tempArray[i]; // += concat all elements
      }
    }
    return str;
  }
}