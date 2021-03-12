package org.javabasic.d20codes;

import java.io.Serializable;

/*
  interface Serializable is also a tag/marker interface.
*/
public class Person implements Serializable {
  /**
   * .
   */
  private static final long serialVersionUID = 1L;
  String name;
  int age;

  public Person() {

  }

  public Person(String name, int age) {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [age=" + age + ", name=" + name + "]";
  }
}
