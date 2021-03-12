package org.javabasic.d04codes.practice;

/*
  Method Overload:
    to simulate method println()
*/
public class Demo07PrintSimulation {
  /** Demo of Method Overload. */
  public static void main(String[] args) {
    int x = 9;
    int y = 10;
    myPrint(x > y);
  } // main

  public static void myPrint(byte num) {
    System.out.println(num);
  }

  public static void myPrint(short num) {
    System.out.println(num);
  }

  public static void myPrint(int num) {
    System.out.println(num);
  }

  public static void myPrint(long num) {
    System.out.println(num);
  }

  public static void myPrint(float num) {
    System.out.println(num);
  }

  public static void myPrint(double num) {
    System.out.println(num);
  }

  public static void myPrint(char ch) {
    System.out.println(ch);
  }

  public static void myPrint(String str) {
    System.out.println(str);
  }

  public static void myPrint(boolean isSame) {
    System.out.println(isSame);
  }
}
