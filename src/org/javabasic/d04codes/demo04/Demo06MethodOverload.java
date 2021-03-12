package org.javabasic.d04codes.demo04;

/*
  Demo of Method Overload
    NOTICE:
      1. method overload, name of method can be same.
      2. it does not relate to return values.
      3. the argument list MUST be different.
    findMax() overload is to show finding max value.  
  
    ** method println() is method overload.
*/
public class Demo06MethodOverload {
  /** Demo of Method overload. */
  public static void main(String[] args) {
    // findMax();
    findMax(1.2, 1.6);
    System.out.println("the max value is: " + findMax(3, 4));
  } // main

  // /** find max value. */
  // public static void findMax() {
  // int max = 3 > 6 ? 3 : 6;
  // System.out.println("the max value is: " + max);
  // }

  /** find max value. */
  public static void findMax(double x, double y) {
    System.out.println(x > y ? x : y);
  }

  /** find max value. */
  public static int findMax(int x, int y) {
    int max = 0;
    if (x > y) {
      max = x;
    } else if (x < y) {
      max = y;
    }
    return max;
  }
}
