package org.javabasic.d10codes.demo02;

/*
  Interface:
    1. interface can not have static code block.
      static {
      }
      interface can not have constructors, b/c interface cannot be instantiated.
      public MyInterfaceA() {
        // Wrong
      }
    
    2. A Subclass can ONLY have one Superclass, a Subclass can have many interfaces at the s/t
      public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
        // override all abstract method from interfaces.
      }
*/
public interface MyInterfaceA {

  /*
    ERROR,
    static {
      // interface cannot have static code block
    }
  */

  /*
    ERROR,
    public MyInterfaceA() {
      // interface cannot have constructor
    }
  */
  
  // abstract method
  public abstract void methodA();

  public abstract void absMethod();

  public default void defaultMethod() {
    System.out.println("default method in MyInterfaceA.");
  }
}
