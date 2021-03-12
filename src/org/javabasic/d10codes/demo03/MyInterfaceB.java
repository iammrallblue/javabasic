package org.javabasic.d10codes.demo03;

public interface MyInterfaceB {
  // abstract method
  public abstract void absMethodB();
  
  public abstract void commonMethod();

  public default void defaultMethod() {
    System.out.println("default method in MyInterfaceB. ");
  }
}
