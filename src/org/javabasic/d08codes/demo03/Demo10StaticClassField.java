package org.javabasic.d08codes.demo03;

/*
  Static instance variable:
    A single copy of static variable is created 
    and shared among all the instances of the class.
  
    issue description:
      when objects all have same variable, the variable 
      can define as a static variable
    Key point:
      directly use Class name to access static instance variable
      or using object name to call the instance variable room
      student.room = "Room 101"; // NOT recommended
*/
public class Demo10StaticClassField {
  /** Demo of static instance variable. */
  public static void main(String[] args) {
    Student student = new Student("Abby", 16);
    Student.room = "Room 101"; 
    System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    System.out.println(" Room: " + Student.room + " Student ID: " + student.getId());
    
    Student student2 = new Student("Bella", 17);
    System.out.println("Name: " + student2.getName() + " Age: " + student2.getAge());
    System.out.println(" Room: " + Student.room + " Student ID: " + student2.getId());
  } // main
}