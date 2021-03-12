package org.javabasic.d18codes;

/*
  Sum up summation of 1 ~ n by Recursion:
    1+2+3+4....+n;
    n+(n-1)+(n-2)+(n-3)+(n-4)+....+1
  what we know:
    the max value: n
    the min value: 1
  condition:
    1. the terminated condition is when value is reached to 1.
    2. the purpose of recursion, to get next added value. (n-1)
  NOTICE:
    recursion for summation is ineffective.
    in the loop of calling summation() itself. 
    (method summation in memory ceaselessly creating, calling, and destroying )

    for loop is better for a sum-up calculation.

*/
public class Demo08Recursion {
  public static void main(String[] args) {
    int number = summation(100000);
    System.out.println(number);
  } // main

  // method for summing up 1 to n;
  private static int summation(int n) {
    // when n == 1, recursion terminated
    if (n == 1) {
      return 1;
    }
    // to get next added value
    return n + summation(n - 1);
  } // summation(n - 1); recursion.
}
