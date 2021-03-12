package org.javabasic.d10codes.demo03;

public interface MyInterfaceA {
  // abstract method
  public abstract void absMethodA();

  public abstract void commonMethod();

  public default void defaultMethod() {
    System.out.println("default method in MyInterfaceA.");
  }
}
