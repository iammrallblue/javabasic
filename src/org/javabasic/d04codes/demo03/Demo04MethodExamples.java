package org.javabasic.d04codes.demo03;

/*
  Instance 1:
    declare a method to determine if two values are the same or NOT

  Instance 2:
    declare a method to sum up numbers from 0 - 100, return sum of values.

  Instance 3:
    declare a void method to print out "Bella" designed times.
    *** IMPORTANT *** the way to call a void method is different to 
    methods with return value (see detail instance 3)

*/
public class Demo04MethodExamples {
  /** Demo of method. */
  public static void main(String[] args) {
    
    // to call method isSame();
    boolean same = isSame(3, 4);
    System.out.println(same);

    // to call method getSum()
    System.out.println("sum up from 0 to 100:");
    int result = getSum();
    System.out.println("The sum of 0 to 100 is: " + result);

    // instance 3, to call a void method here.
    printMethod(4);
  } // main

  /** instance 1 for boolean. (4 ways return value)*/
  public static boolean isSame(int x, int y) {
    // boolean same;
    // if (x == y) {
    // same = true;
    // } else {
    // same = false;
    // }
    // return same;

    // // ternary operator
    // boolean same = x == y ? true : false;
    // return same;

    // // 3
    // boolean same = x == y;
    // return same;

    // the simplest way
    return x == y;
    //
  }

  /** instance 2. */
  public static int getSum() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum;
  }

  /** instance 3 void method. */
  public static void printMethod(int count) {
    for (int i = 0; i <= count; i++) {
      System.out.println("Bella " + (i + 1));
    }
  }
}
