package org.javabasic.d10codes.demo01;

/*
  in Java 8:
    interface can declare a new method which is default method.
    Format:
      public default void defaultMethod(argument list) {
        // body of default method
      }
    IMPORTANT, Key point:
      1. the default method is invented for the upgrade of interface.
      2. "public default" method in interface. public can be omitted
          but public cannot be replaced like keyword "protected"
      3. default method can be overridden by implementation classes.
          (see MyInterfaceDefaultB())
    
    For default method:
      the default method is for when interface has a new abstract method added, 
      but the implementation class cannot implement the new abstract method.
    Issue Description:
      Interface MyInterfaceDefault has two implementation classes
        MyInterfaceDefaultA, and MyInterfaceDefaultB. both overrode method
        absMethod(), when adding new abstract methods in Interface MyInterfaceDefault
        both implementation classes is in using, can not override all new abstract methods
        from MyInterfaceDefault. 
      Solution:
        declare all methods in MyInterfaceDefault as default method.

*/
public interface MyInterfaceDefault {
  
  // abstract method
  public abstract void absMethod();

  // a new added abstract method
  // public abstract void absMethod2();
  // adding new abstract methods will cause
  // all implementation classes error.

  // solution:
  // change the absMethod2 to default method
  public default void defaultMethod() {
    System.out.println("this default method is instead of the abstract method in interface.");
  }
  
}
