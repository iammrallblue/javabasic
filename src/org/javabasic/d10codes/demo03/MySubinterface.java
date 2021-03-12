package org.javabasic.d10codes.demo03;

/*
  Subinterface:
    how many abstract method it will have? 4
      1. absMethodC() is from MyInterfaceA
      2. absMethodD() is from MyInterfaceB
      3. commonMethod() is from both MyInterfaceA and MyInterfaceB.
      4. absMethod() is from Subinterface itself
    NOTICE:
      1. abstract methods in Super interfaces can be duplicated.
      2. if Super interfaces exist default methods, subinterface MUST
          override default methods with keyword "default". 
*/
public interface MySubinterface extends MyInterfaceA, MyInterfaceB {
  // abstract method
  public abstract void absMethod();

  @Override
  default void defaultMethod() {
    System.out.println("default method is overridden in Subinterface.");
  }
}
