package org.javabasic.d11codes.demo01;

/*
  A Final Class:
    Format:
      public final class className {
        // body of class
      }
    A final class CANNOT instantiate by any other classes.
    therefore, methods of a final class CANNOT be overridden.
      ** no class or implementation class can inherit it.
*/
public final class FinalClass {
  // instance methods
  public void method() {
    System.out.println("method in a final class.");
  }
}
