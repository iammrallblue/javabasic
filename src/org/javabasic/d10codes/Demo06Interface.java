package org.javabasic.d10codes;

/*
  As we know:
    1. Subclass and Superclass is in single inheritance. 
        which mean Subclass can ONLY have one Superclass.
    2. A implementation class can implements as many as interfaces.
    3. Interface and interface can have multiple inheritance.
      (see MySubinterface extends MyInterfaceC, MyInterfaceD)

  NOTICE:
    1. It does not matter, when multiple Superinterfaces have many duplicate
      abstract methods.
    2. It does matter, when multiple Superinterfaces have many duplicate
      default methods. Subinterface MUST override the default method which Superclasses have.
      ** keyword default CANNOT be omitted.
*/
public class Demo06Interface {
  
}
