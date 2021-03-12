package org.javabasic.d14codes;

/*
  Variable Arguments (Varargs) in Java:
    In JDK 5, Java has included a feature that simplifies 
    the creation of methods that need to take a variable number of arguments. 
    Usage:
      When data type of argument is certain. but the variable-length is undefined,
      this condition can apply variable argument list.
    Format:
      public static int variableArgs(int ... x)
    
    Principle of Variable Argument list:
      it is based on the Array, it is operated on as an array, 
      check length of variable argument list by the method length()

    NOTICE:
      1. method ONLY can have one variable argument
      2. If method have more than one argument, then the variable argument MUST be in the end of
          argument list. (See example)
*/
public class Demo06VarArgs {
  /** . */
  public static void main(String[] args) {

    // print out array
    // int array = summation();
    // when method summation is called, the array will be created.
    // which length is 0;
    // System.out.println(array); // [I@6d06d69c mem address.

    // add parameter, the length of array will be changed
    int array2 = summation(10);
    System.out.println("return value is: " + array2); // result is 0 b/c method return 0;
    // length of array2 is 1;

    int array3 = summation(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println("Sum up value is: " + array3); // 45

    // calling method()
    method("Bella", 5.2, 0, 1, 3, 1, 4);
  } // main

  // method summation of two number, sometime the length of argument is
  // unknown. using variable argument list
  // public static int summation(int x, int y) {
  // return x + y;
  // }

  // public static int summation3(int x, int y, int z) {
  // return x + y + z;
  // }

  /** variable argument is based on Array. */
  public static int summation(int... array) {
    System.out.println(array); // [I@6d06d69c
    System.out.println("Array's length is: " + array.length); // array's length

    // sum up all values
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return sum;
  }

  /** variable argument MUST be the last argument. */
  public static void method(String str, double var, int i, int... a) {

  }
}
