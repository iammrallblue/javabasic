package org.javabasic.d06codes.demo05;

public class Demo01Student {
  /** Demo of Standard Class named Student. */
  public static void main(String[] args) {
    // creates object of Student with non-parameterized constructor
    Student student = new Student();
    System.out.println(student);

    // creates object of Student with parameterized constructor.
    Student student2 = new Student("Bella", 19); // assign values by constructor,
    // don't need setter() to assign values.
    System.out.println("My name is: " + student2.getName());
    System.out.println("I am " + student2.getAge() + " years old.");

    // changing name and age of object student2
    student2.setName("Danielle");
    student2.setAge(17);
    System.out.println("My name is: " + student2.getName());
    System.out.println("I am " + student2.getAge() + " years old.");
  } // main
}
