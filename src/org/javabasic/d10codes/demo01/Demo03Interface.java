package org.javabasic.d10codes.demo01;

/*
  Static Method in Interface:
    Key point:
      1. CANNOT call the static method by the object of implementation class.
      2. directly call the static method by the name of interface.
      3. a static method cannot call by object of implementation class.

    TIP:
      static variable, method, etc... does not relate to the object of class
      it is related to the class itself.
*/
public class Demo03Interface {
  /** Demo of static method in Interface. */
  public static void main(String[] args) {
    // object of implementation class
    // MyInterfaceStaticImpl myStaticImpl = new MyInterfaceStaticImpl();
    // myStaticImpl.staticMethod(); // Wrong to call static method in interface.

    // call static method directly by name of Interface.
    MyInterfaceStatic.staticMethod();
  } // main
}
