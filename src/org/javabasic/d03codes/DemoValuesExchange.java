package org.javabasic.d03codes;

/*
    Practice:
        Exchanging values of two variables.
        x = 1;
        y = 2;
        after:
        y = 1;
        x = 2;
        2nc method pros and cons:
          pros:
            Don't need temp variables;
          cons:
            addition might over the range of data type
            ONLY be appropriated for primitive data type
        3rd method pros and cons:
          cons:
            ONLY be appropriated for primitive data type
*/
public class DemoValuesExchange {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println("Before changing values:");
    System.out.println("X is: " + x);
    System.out.println("Y is: " + y);

    // 1st method, changing values of x and y
    // int temp = x;
    // x = y;
    // y = temp;
    // System.out.println("After changing values:");
    // System.out.println("X is: " + x);
    // System.out.println("Y is: " + y);

    // 2nd method, changing values of x and y
    // System.out.println("=======2nd method, exchanging values of two
    // variables============");
    // x = x + y; // 10 + 20 = 30, x = 30;
    // y = x - y; // 30 - 20 = 10, y = 10;
    // x = x - y; // 30 - 10 = 20, x = 20;
    // System.out.println("x = " + x + ", y = " + y);

    // 3rd method, changing values of x and y by bit operator
    x = (x ^ y);
    y = (x ^ y);
    x = x ^ y;
    System.out.println("x = " + x + ", y = " + y);
  } // main

}