package org.javabasic.d10codes.demo02;

/* 
  A Subclass, also an implementation class as well
*/
public class Subclass extends Superclass implements MyInterfaceC {
  // instance variable
  int num = 20;
  int date = 3;

  @Override
  public void methodA() {
    System.out.println("overrode the Superclass method in Subclass.");
  }
  
  // @Override
  // public void method() {
  //   System.out.println("overrode the Superclass method in Subclass.");
  // }

  public void subMethod() {
    System.out.println("A specific method in Subclass.");
  }
}
