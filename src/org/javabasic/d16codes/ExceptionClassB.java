package org.javabasic.d16codes;

// Subclass ExceptionClassB extends from ExceptionsClassA
public class ExceptionClassB extends ExceptionClassA {

  @Override
  public void method01() throws NullPointerException, ClassCastException {
  }

  @Override
  public void method02() throws ArrayIndexOutOfBoundsException {
  }

  @Override
  public void method03() {
  }
}