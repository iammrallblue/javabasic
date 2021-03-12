package org.javabasic.d09codes.demo01;

/*
  Inheritance:
    Inheritance can be defined as the process where one
    class acquires the properties (methods and fields) of another.
    format:
      public class SuperClass {}
      public class Subclass extends SuperClass {}
    Key Point:
      1. keyword, "extends"
*/

public class Demo01Inheritance {
  /** Demo of Inheritance. */
  public static void main(String[] args) {
    // create object of subclass Instructor
    Instructor ins = new Instructor();

    // call method which inherited from Superclass
    ins.superMethod();

    // create object of subclass Assistant
    Assistant as = new Assistant();

    // call method which inherited from Superclass
    as.superMethod();
  } // main
}
