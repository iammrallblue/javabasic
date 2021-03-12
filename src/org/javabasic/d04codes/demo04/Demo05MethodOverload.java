package org.javabasic.d04codes.demo04;

/*
  Method Overloading:
    1. method overloading has same method name, but different argument list. (essential condition)
    2. ONLY need to remember one method name.

    what does mean "different argument list":
      1. each have different parameters.
      2. each have different data type of parameters
      3. multiple types, and different order.
*/
public class Demo05MethodOverload {
  public static void main(String[] args) {

  } // main

  //
  public static int method(int x, int y) {
    System.out.println("method with 2 parameters");
    return x + y;
  }

  // return datatype
  // public static double method(int x, int y) {
  // ERROR
  // }

  public static int method(int x, int y, int z) {
    System.out.println("method with 3 parameters.");
    return x * y * z;
  }

  public static int method(double x, double y) {
    System.out.println("method with two double parameters.");
    return (int) ((int) x / y);
  }

  public static int method(double x, int y) {
    System.out.println("method with one double, and one int parameter.");
    return (int) (x % y);
  }
}