package org.javabasic.d06codes.demo05;

/*
  A standard class should have 4 parts: (Student Class)
    key point:
      1. All instance variables MUST use private
      2. create Getter() and Setter() for each instance variable.
      3. should have one NO-ARGUMENT CONSTRUCTOR
      4. should have one PARAMETERIZED CONSTRUCTOR
      5. A standard class called JAVA BEAN. 
    
    NOTICE:
      1. Instance variable directly defines in the Class, outside of the method.
      2. Instance method does not have keyword "static".
      2. 
  */
public class Student {

  // instance variables
  private String name;
  private int age;

  // Constructor, if did not declare, default constructor of a Class will be
  // applied automatically
  public Student() {
    // Non-parameterized constructor
    System.out.println("Non-parameterized constructor is invoked.");
  }

  /** Student Constructor. */
  public Student(String name, int age) {
    // Parameterized Constructor (全参构造)
    System.out.println("Parameterized constructor is invoked.");
    this.name = name;
    this.age = age;
  }

  // setter and getter to assign values to name and age
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

  // instance methods, it does not have keyword "static "
  public void eat() {
    System.out.println("Students need eating.");
  }

  public void sleep() {
    System.out.println("Students need taking a break");
  }

  public void study() {
    System.out.println("Students need studying hard.");
  }
}