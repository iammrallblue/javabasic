package org.javabasic.d13codes;

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {

  @Override
  public void method(I i) {
    System.out.println(i);
  }
  
}
