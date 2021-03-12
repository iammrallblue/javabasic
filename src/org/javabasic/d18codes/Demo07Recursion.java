package org.javabasic.d18codes;

/*
  Recursion:
    Recursion is the technique of making a function call itself. 
    This technique provides a way to break complicated problems 
    down into simple problems which are easier to solve.
  Pre-Condition of Recursion:
    When calling a method, the calling method' body remains the same.
    Arguments of method are different when using recursion.
  NOTICE:
    Recursion MUST have limitation. otherwise it will have 
    StackOverflowError.
    2. Constructors CANNOT use Recursion. b/c constructors are ONLY
      for instantiating objects of classes.
      if using recursion, it will instantiate infinity objects in memory,
*/
public class Demo07Recursion {
  public static void main(String[] args) {
    // method1();
    method2(1);
  } // main

  // recursion with limitation
  private static void method2(int x) {
    System.out.println(x);
    if (x == 1000) {
      return; // terminated method2
    }
    method2(++x);
  }

  // private static void method1() {
  // System.out.println("method1 is called by recursion.");
  // method1(); // this is called Recursion,
  // }
  // method1 will throw StackOverflowError.
}
