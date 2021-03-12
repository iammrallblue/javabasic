package org.javabasic.d18codes;

/*
  Recursion for factorial:
    n! = n * (n-1) * (n-2) * (n-3) * ... 3 * 2 * 1;

  condition of termination:
    when n == 1, recursion terminated.
  
  purpose of recursion:
    get the next factorial value (n - 1)
  ** the argument is change every time when method is called.
    argument value is getting smaller to 1
    5..4..3..2..1

*/
public class Demo09Recursion {
  public static void main(String[] args) {
    int factorial = method(5);
    System.out.println(factorial);
  } // main

  // method factorial by using recursion
  private static int method(int x) {
    if (x == 1) {
      return 1;
    }
    return x * method(x - 1);
  }

}