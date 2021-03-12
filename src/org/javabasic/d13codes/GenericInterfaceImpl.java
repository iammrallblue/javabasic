package org.javabasic.d13codes;

public class GenericInterfaceImpl implements GenericInterface<String> {
  
  @Override
  public void method(String str) {
    System.out.println(str);
  }
}
