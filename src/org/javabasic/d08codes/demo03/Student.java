package org.javabasic.d08codes.demo03;

/*
  Class Student:
    the keyword static applies to the instance variable
      the String room has the keyword static, 
      means room variable belongs to Class itself, but not any objects of Class.
*/
public class Student {
  // Class Fields (instance variables)
  private int id;
  private String name;
  private int age;
  static String room;
  private static int idCounter = 1000;

  public Student() {
  }

  /** parameterized constructor of Class Student. */
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    // id will be increment when new object is created.
    this.id = ++idCounter;
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}