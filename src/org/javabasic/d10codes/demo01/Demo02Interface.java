package org.javabasic.d10codes.demo01;

/*
  Default Method in Interface:
    1. default method of interface, can call by the object of implementation class of interface.
    2. default method of interface, can override by the implementation class.
*/
public class Demo02Interface {
  /** Demo of default method in Interface. */
  public static void main(String[] args) {
    MyInterfaceDefaultA myDefaultA = new MyInterfaceDefaultA();
    myDefaultA.absMethod(); // overrode method called.

    // default method exists in Interface, therefore, object will 
    // look at its class, then the interface it implemented.
    myDefaultA.defaultMethod(); // default method inherited from the interface.

    MyInterfaceDefaultB myDefaultB = new MyInterfaceDefaultB();
    myDefaultB.absMethod();; // overrode method called.

    myDefaultB.defaultMethod(); // default method inherited from the interface.
  } // main
}
