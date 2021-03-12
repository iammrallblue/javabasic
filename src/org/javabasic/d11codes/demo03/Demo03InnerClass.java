package org.javabasic.d11codes.demo03;

/*
  Inner Class: (See Body Class)
    A outer class contains an inner class, such as body contains heart, liver, lung.
    In Java, it is also possible to nest classes (a class within a class). 
    The purpose of nested classes is to group classes that belong together,
    which makes your code more readable and maintainable.

  2 different inner classes:
    1. Instance Inner Class
    1. Local Inner Class
  Instance Inner Class Format:
    public class OuterClass {
      public class InnerClass { 
      }
    }
  NOTICE:
    Inner can access everything of outer class.
    Outer Class needs to use the object of Inner Class to access Inner Class.
  
  Usage of Inner Class:
    1. indirectly call the inner class inside of the method of outer class.
      then call the method of outer class in the main method. (See the body method)
    2. directly call the inner class.
      Format:
        OuterClass.InnerClass object = new OuterClass().new InnerClass();
*/
public class Demo03InnerClass {
  /** Demo of Inner Class. */
  public static void main(String[] args) {
    // how to use inner class
    Body body = new Body();
    // call the method of outer class, also call the method of inner class.
    body.bodyMethod();

    // call the method of inner class directly.
    Body.Heart heart = new Body().new Heart();
    heart.beat();
  } // main
}
