package org.javabasic.d03codes.practice;

/*
  using if statement and ternary operator to find out max value
*/
public class Demo06IfAndTernary {
  /** Demo of if statement and Ternary Operator. */
  public static void main(String[] args) {
    // if statement
    int m = 2;
    int n = 3;
    int max;
    if (m > n) {
      max = m;
    } else {
      max = n;
    }
    System.out.println("The max value is: " + max);

    // ternary operator
    int max2 = m > n ? m : n;
    System.out.println("The max value is: " + max2);
  } // main
}
