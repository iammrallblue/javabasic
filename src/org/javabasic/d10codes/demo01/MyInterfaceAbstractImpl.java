package org.javabasic.d10codes.demo01;

/*
  A implementation class for implementing Interface:
    implementing an interface needs to override all abstract methods from the interface.
*/
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {

  @Override
  public void absMethod() {
    System.out.println("I am the first overrode abstract method.");
  }

  @Override
  public void absMethod2() {
    System.out.println("I am the second overrode abstract method.");
  }

  @Override
  public void absMethod3() {
    System.out.println("Iam the third overrode abstract method.");
  }

  @Override
  public void absMethod4() {
    System.out.println("I am the fourth overrode abstract method. ");
  }

}
