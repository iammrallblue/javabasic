package org.javabasic.d09codes;

/*
  Superclass and Subclass:
    in the inheritance relationship, if both have same name variables,
    when creating the object of Subclass, there are two ways to access variables:
      1. Directly access:
          access variables through the object of Subclass.
        *** whoever is on the left side of =, gives priority to,
      2. Indirectly access:
          access variables through the instance method. 
*/
public class Demo02AccessVariables {
  /** . */
  public static void main(String[] args) {
    // object of Superclass ClassA
    // ClassA ca = new ClassA();
    // // object of Superclass ONLY can access its own instance variables
    // System.out.println(ca.superNum);

    // // object of Subclass ClassB
    // ClassB cb = new ClassB();
    // // object of Subclass can access Superclass' instance
    // // variables and its own instance variables
    // System.out.println(cb.superNum); // 10
    // System.out.println(cb.subNum); // 20

    // System.out.println(cb.number);
    // // prefer to use variable in the Subclass ClassB, b/c on the left is ClassB

    // ClassA ca2 = new ClassB();
    // System.out.println(ca2.number);
    // // prefer to use variable in the Superclass ClassA, b/c on the left is Class
    // A;

    // // this method is from Subclass ClassB.
    // cb.subMethod();

    // // this method is from Superclass ClassA
    // cb.superMethod();
    // prefer to use variable from Superclass, b/c superMethod is from the
    // Superclass.
  } // main
}
