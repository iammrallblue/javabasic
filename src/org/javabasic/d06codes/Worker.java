package org.javabasic.d06codes;

/*
  A standard Class Work
    1. private instance variables
    2. parameterized constructor and non-parameterized constructor
    3. Setter and Getter
*/
public class Worker {
  // data fields
  private String name;
  private int age;

  // Constructors
  public Worker() {
    // non-parameterized constructor
  }

  /** Work Constructor. */
  public Worker(String name, int age) {
    // parameterized constructor
    this.name = name;
    this.age = age;
  }

  // Setter & Getter
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  public int getAge() {
    return age;
  }
}
