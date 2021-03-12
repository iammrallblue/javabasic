package org.javabasic.d06codes.demo03;

/*
  Demo of Student Class.
*/
public class Demo09Student {
  /** Demo of Student Class. */
  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Bella");
    student.setAge(18);
    student.setMale(false);
    // getter to get all values
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println(student.getName() + " is a male? " + student.isMale());
  } // main
}
