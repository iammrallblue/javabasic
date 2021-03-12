package org.javabasic.d07codes.demo05;

import java.util.ArrayList;

/*
  Demo of ArrayList<Student>
    to store objects of Student Class to ArrayList<>
  
  Steps:
    1. create Student Class.
    2. create an ArrayList<Student> for storing objects
    3. creates 4 objects of Student
    4. call method add() to add objects to ArrayList<>
    5. iterate ArrayList<>
*/
public class Demo02Student {
  /** Demo of ArrayList<>. */
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<>();

    Student student = new Student("Abby", 15);
    Student student2 = new Student("Bella", 16);
    Student student3 = new Student("Cathy", 17);
    Student student4 = new Student("Danielle", 18);

    array.add(student);
    array.add(student2);
    array.add(student3);
    array.add(student4);

    // 5
    for (Student stu : array) {
      System.out.println("ArrayList has: " + stu.getName());
    }

    // for loop
    for (int i = 0; i < array.size(); i++) {
      Student stu = array.get(i);
      System.out.println("Name: " + stu.getName() + " Age: " + stu.getAge());
    }
  } // main
}
