package org.javabasic.d09codes;

/*
  Keyword super and this
    how to solve th variables rename (duplicate name)
  Local Variable: (see ClassD's method)
    directly using local variable
  Instance Variable in Subclass:
    using keyword this to call out the instance variable
  Instance Variable in Superclass:
    using keyword super to call out the instance variable.

*/
public class Demo03SuperAndThis {
  /** Example of keyword super and this. */
  public static void main(String[] args) {
    // object of Subclass ClassD
    ClassD cd = new ClassD();
    cd.subMethod();
  } // main
}