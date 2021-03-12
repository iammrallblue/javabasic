package org.javabasic.d10codes.demo01;

/*
  Key point:
    Interface:
      1. an interface is a reference type, similar to a class, 
          that can contain only constants, abstract methods, 
          default methods, static methods, and nested types. 
      2. Method bodies exist only for default methods and static methods. 
      3. Interfaces cannot be instantiated—they can only be implemented by classes 
          or extended by other interfaces
    Format:
      public interface InterfaceName {
        // body of interface.
      }

    in Java 7:
      interface contains
        1. constant
            final String str;
        2. abstract methods.
            public abstract void method();
    in Java 8:
      interface contains:
        1 & 2,
        3. default methods
        4. static methods
    int Java 9:
      interface contains:
        1,2,3,4
        5. private method.

    Usage of Interface:
      1. CANNOT directly create object of Interface, 
      MUST through an implementation class to implement interface
      then to use the interface.
      Format:
        public class ImplementClass implements InterfaceName {
          // body of implement class.
        }
      2. implement class of Interface MUST override all abstract method from interface.
        take off keyword abstract, and add the body of method.
      3. last, create object of implement class to use it.

    NOTICE:
      If an implement class DID not override all abstract methods from interface,
      then the implement class MUST be declared as an ABSTRACT CLASS...
*/
public interface Demo01Interface {
  /** Demo of defining interface. */
  public static void main(String[] args) {
    // CANNOT direct create object of interface
    // MyInterfaceAbstract myInterface = new MyInterfaceAbstract();
    // Cannot instantiate the type MyInterfaceAbstract

    MyInterfaceAbstractImpl myImpl = new MyInterfaceAbstractImpl();
    myImpl.absMethod();
    myImpl.absMethod2();
  } // main
}
