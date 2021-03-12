package org.javabasic.d10codes.demo05;

/*
  Using Instance Methods in Polymorphism:
    1. Run time polymorphism:
        Superclass spc = new Subclass();
          overrides method() of Superclass in Subclass.
          spc.method() it calls method() in Subclass.
        (see spc.method())
      2. 
    TIPS:
      Superclass spc = new Subclass();
      compiling focuses on left side.
      running focuses on right side.
*/
public class Demo09PolymorphismMethod {
  /** Demo of instance method in polymorphism. */
  public static void main(String[] args) {
    // non-polymorphism
    Superclass su = new Superclass();
    su.method(); // call method() from Superclass

    // using run time polymorphism
    Superclass spc = new Subclass();
    spc.method(); // call method in Subclass.
    // call superMethod() from Superclass. b/c inheritance.
    spc.superMethod();

    // ERROR, Superclass does not have this method
    // spc.subMethod();
  } // main
}
