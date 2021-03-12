package org.javabasic.d10codes.demo02;

/*
  A implementation class (Subclass) implements many interface
*/
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
  @Override
  public void methodB() {
    System.out.println("Overrode abstract method methodB in implementation class.");
  }

  @Override
  public void methodA() {
    System.out.println("Overrode abstract method methodA in implementation class");
  }

  @Override
  public void absMethod() {
    System.out.println("absMethod() is existed in MyInterfaceA and MyInterfaceB");
    System.out.println("absMethod() is overridden in implementation class.");
  }

  @Override
  public void defaultMethod() {
    System.out.println("Overrode default method in implementation class.");
  }
}
