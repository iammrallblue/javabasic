package org.javabasic.d06codes.demo03;

public class Base {
  private String baseName = "Base";

  public Base() {
    printName();
  }

  public void printName() {
    System.out.println(baseName);
  }

  public static void main(String[] args) {
    Base base = new Sub(); // Polymorphism
    System.out.println(base);
  } // main

}
