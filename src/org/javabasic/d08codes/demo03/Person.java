package org.javabasic.d08codes.demo03;

public class Person {
  static {
    System.out.println("Static code block is executed.");
  } 
  
  public Person() {
    System.out.println("Non-parameterized Constructor.");
  }
}
