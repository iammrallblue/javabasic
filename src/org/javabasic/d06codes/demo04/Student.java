package org.javabasic.d06codes.demo04;

/*
  Constructor:
    1. A constructor in Java is a special method that is used to initialize objects. 
    2. The constructor is called when an object of a class is created. 
    3. It can be used to set initial values for object attributes:
    Format:
      public Student() {}
    key point:
      1. constructor name MUST same with class.
      2. constructor NEVER have return value and void.
      3. constructor NEVER have return a specific value.
      4. if constructors haven't declared by developers,
          there is default constructor created by JVM.
      5. when constructor declared by developers, 
          the default constructor will hide automatically.
      6. constructor can be overloaded.
  issue description:
    even the parameterized constructor can assign values to instance variables,
    we still need getter and setter for values assignation,
    when calling instance variables outside of this class.
*/
public class Student {
  // fields
  private String name;
  private int age;

  public Student() {
    System.out.println("Non-Parameterized constructor is executed.");
  }

  /** Parameterized constructor. */
  public Student(String name, int age) {
    System.out.println("Parameterized constructor is executed.");
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}
