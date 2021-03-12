package org.javabasic.d13codes;

public class Demo07GenericMethod {
  /** . */
  public static void main(String[] args) {
    // create object of Class GenericMethod
    GenericMethod gm = new GenericMethod();

    // calling generic method from GenericMethod
    // and determining data type of Generic
    gm.method(1); // Integer
    gm.method("Bella"); // String
    gm.method(8.89); // Double
    gm.method(true); // Boolean

    // calling a static generic method from GenericMethod
    // and determining data type of Generic
    GenericMethod.method02(1); // Integer
    GenericMethod.method02("Bella"); // String
    GenericMethod.method02(8.2); // Double
    GenericMethod.method02(false); // Boolean
  } // main
}
