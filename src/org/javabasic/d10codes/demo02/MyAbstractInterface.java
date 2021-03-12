package org.javabasic.d10codes.demo02;

/*
  issue desiccation:
    implementation class don't override all
    abstract methods from interfaces
  solution:
    modify implementation class as an abstract class,
*/
public abstract class MyAbstractInterface implements MyInterfaceA, MyInterfaceB {

  @Override
  public void methodB() {
    System.out.println("Override abstract method B in implementation class.");
  }

  @Override
  public void methodA() {
    System.out.println("Override abstract method B in implementation class.");
  }

  // @Override
  // public void absMethod() {
  // }

  @Override
  public void defaultMethod() {
    System.out.println("default method MUST override.");
  }
}