package org.javabasic.d04codes.demo02;

/*
  using method() to print out a star pattern.
  Format:
    public static void methodName() {
      // body of method
    }

  NOTICE:
    1. Method should declare inside of classes. CANNOT declare inside of methods.
    2. methods can be unordered.
    3. methods never execute by themselves, have to call methods to execute them. 
    4. if methods have return values, then "return" keyword must be present.
        the return type MUST be same as method.
    5. void means there is no return value.
        public static void methodName() {
          return; // return in a void method can be ignored.
          // cannot return any type;
        }
*/
public class Demo01Method {
  public static void main(String[] args) {
    printMethod();
  } // main

  /** a method to print a star pattern. */
  public static void printMethod() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 20; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
