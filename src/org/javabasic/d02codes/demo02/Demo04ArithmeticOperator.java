package org.javabasic.d02codes.demo02;

/*
  Operators:
    + - * /
  Expressions:
    20 + 5, a + b...
  four arithmetic operation:
    plus: +
    minus: -
    multiple: *
    divide: / ÷  ignored remainder
    modulo % get remainder

  Notice:
    1. when calculating different data types, default get the larger data type
        int x = 1, double y = 2.1;
        System.out.println(x + y); the result will be double.
*/
public class Demo04ArithmeticOperator {
  /** . */
  public static void main(String[] args) {
    // + operator
    System.out.println(20 + 30);

    // two variables calculating
    int a = 1;
    int b = 2;
    System.out.println(a - b);

    int x = 10;
    int y = 3;
    int result = x / y;
    System.out.println(result); // result is 3, not remainder 1.

    int result2 = x % y;
    System.out.println(result2); // the Modulus is 1, NOT result.
  } // main
}
