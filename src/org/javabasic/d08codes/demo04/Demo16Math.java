package org.javabasic.d08codes.demo04;

/*
  java.lang.Math:
    Class Math:
      Common static methods:
        public static double abs(double num), to get the absolute value
        public static double ceil(double num), return a whole integer number
        public static double floor(double num), return a whole integer number
        public static long round(double num), return a rounded number.
        Math.PI a static constant of the Math Class
*/
public class Demo16Math {

  /** Demo of static methods of Math class. */
  public static void main(String[] args) {
    // using abs(double num) to return a absolute value
    System.out.println(Math.abs(3.14)); // 3.14
    System.out.println(Math.abs(0)); // 0
    System.out.println(Math.abs(-2.5)); // 2.5

    // using ceil(double num) to return a whole integer number
    System.out.println(Math.ceil(3.9)); // 4.0
    System.out.println(Math.ceil(3.1)); // 4.0
    System.out.println(Math.ceil(3.0)); // 3.0

    // using floor(double num) to return a whole integer number
    System.out.println(Math.floor(5.9)); // 5.0
    System.out.println(Math.floor(10.2)); // 10.0
    
    // using round(double num) to return a rounded number
    System.out.println(Math.round(3.54)); // 4
    System.out.println(Math.round(2.4)); // 2

    // using Math.PI
    System.out.println(Math.PI);
  }
}