package org.javabasic.d16codes;

/*
  Exceptions of Superclass and Subclass:
    1. if Superclass has thrown multiple exceptions, when Subclass overrides methods from Superclass
        Subclass need to throw multiple exceptions same as  Superclass.
    2. if Superclass has not thrown any exceptions, then Subclass should not have thrown
        any exceptions.
    NOTICE:
      Exceptions of Superclass should be happened in Subclass.
      Subclass can throw Subclass of Class Exception.
*/
// Superclass ExceptionClassA
public class ExceptionClassA {
  public void method01() throws NullPointerException, ClassCastException {

  }

  public void method02() throws IndexOutOfBoundsException {
  }

  public void method03() throws IndexOutOfBoundsException {

  }
}
