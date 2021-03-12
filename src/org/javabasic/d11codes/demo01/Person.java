package org.javabasic.d11codes.demo01;

public class Person {
  // instance variable
  private final String name;

  public Person() {
    name = "Bella";
  }

  public Person(String name) {
    this.name = name;
  }

  // public void setName(String name) {
  //   this.name = name;
  // }

  public String getName() {
    return name;
  }
}
