package org.javabasic.d11codes.demo04;

public class Demo05LocalClass {
  /** . */
  public static void main(String[] args) {
    // create an object of Outer Class Two 
    OuterClass outerClass = new OuterClass();

    // call outer method of outer class. included 
    // the local class and method inside of outer method.
    outerClass.outerMethod();
  } // main
}
