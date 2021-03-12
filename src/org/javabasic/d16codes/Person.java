package org.javabasic.d16codes;

public class Person {
  // fields
  private String name;
  private int age;

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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

  /** method run() . */
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println(this.name + i);
    }
  }
}
