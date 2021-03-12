package org.javabasic.d04codes.practice;

/*
  Instance:
    to compare two values by using method overloading
      1, two bytes,
      2. two shorts
      3. two ints
      4. two longs
    then call all overloaded methods in main method

    *** important
      to double check how to assign values to each different type parameter.

  Instance:
    to determine which is related to the method overloading.

  NOTICE:
    println() is an example of method overloading.

*/
public class Demo06OverloadExamples {
  /** method overload. */
  public static void main(String[] args) {
    System.out.println(isSame((byte) 1, (byte) 2));

    short m = 3;
    short n = 4;
    System.out.println(isSame(m, n));

    System.out.println(isSame(5, 6)); // (5,6) default type is int.

    System.out.println(isSame(7L, 8L));
  } // main

  /** compare two bytes. */
  public static boolean isSame(byte x, byte y) {
    System.out.println("with 2 byte parameters.");
    boolean var;
    if (x == y) {
      var = true;
    } else {
      var = false;
    }
    return var;
  }

  /** compare two shorts, method overload, ternary operator. */
  public static boolean isSame(short x, short y) {
    System.out.println("with 2 short parameters.");
    boolean var = x == y ? true : false;
    return var;
  }

  /** compare two ints, method overload, return x == y directly. */
  public static boolean isSame(int x, int y) {
    System.out.println("with 2 int parameters.");
    return x == y;
  }

  /** compare two longs, return true or false directly. */
  public static boolean isSame(long x, long y) {
    System.out.println("with 2 long parameters.");
    if (x == y) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * determine method overloading two key tips: 1. same method name, 2. different
   * argument list called method overload
   */
  public static void open() {
    // correct method overloading
  }

  public static void open(int x) {
    // correct overloading
  }

  // static void open(int x, int y) {
  // conflict with a method below.
  // }

  public static void open(double x, int y) {
    // correct overloading
  }

  // public static void open(int x, double y) {
  //   // conflict with line a method below
  // }

  // public void open(int x, double y) {
  //   // conflict with a method above
  // }

  // public static void OPEN() {
  //   // correct method defined, but not method overloading, different method name.
  // }

  // public static void open(int m, int n) {
  //   // ERROR, conflict with a method above
}