package org.javabasic.d13codes;

public class Demo08GenericInterface {
  /** . */
  public static void main(String[] args) {
    // object of Implementation Class, and does not follow the Generic Interface's type
    GenericInterfaceImpl genericInterfaceImpl = new GenericInterfaceImpl();
    genericInterfaceImpl.method("Hello, Bella");

    // object of Implementation Class, and type is followed the type of Generic Interface.
    GenericInterfaceImpl2<Integer> genericInterfaceImpl2 = new GenericInterfaceImpl2<>();
    genericInterfaceImpl2.method(52);

    GenericInterfaceImpl2<Double> genericInterfaceImpl3 = new GenericInterfaceImpl2<>();
    genericInterfaceImpl3.method(0.0);
  } // main
}
