package org.javabasic.d10codes.demo02;

public interface MyInterfaceB {
  // abstract method
  public abstract void methodB();

  public abstract void absMethod(); 

  public default void defaultMethod() {
    System.out.println("default method in MyInterfaceB.");
  }
}
