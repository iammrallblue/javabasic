package org.javabasic.d04codes;

/*
  1.
    A method requires a number as argument
    based on the number to print out a set of numbers.
  2. 
    calculate the difference of two numbers.
       
*/
public class Demo07Method {
  /** example to print out a set number by argument. */
  public static void main(String[] args) {

    // call method printNumber()
    // printNumber(30); // 30 is an actual parameter
    // calcTwoNumber(1, 3);
    // System.out.println(isCheck(3));
    // pickEven();
    pickThreeDigitsOdd();
  } // main

  /** method for print out a set of number. */
  public static void printNumber(int x) { // x is form parameter.
    for (int i = 1; i <= x; i++) {
      System.out.print(i + "\t");
    }
  }

  /** calculate the difference of two numbers. */
  public static void calcTwoNumber(double x, double y) {
    double difference = x - y;
    System.out.println("the difference of " + x + " and " + y + " is: " + difference);
  }

  /** determine a number whether EVEN or ODD. */
  public static boolean isCheck(int value) {
    if (value % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /** pick EVEN number from 1 to 10, and call method isCheck(). */
  public static void pickEven() {
    for (int i = 1; i <= 10; i++) {
      // isCheck(i) equals to isCheck(i) == true;
      if (isCheck(i)) { // if isCheck() is true, print out all Even numbers.
        System.out.println(i);
      }
    }
  }

  /** pick 3 digits ODD numbers from 100 to 999, and call method isCheck(). */
  public static void pickThreeDigitsOdd() {
    for (int i = 100; i <= 999; i++) {
      if (!isCheck(i)) {
        System.out.print(i + ", ");
      }
    }
  }
}
