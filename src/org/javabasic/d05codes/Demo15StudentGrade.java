package org.javabasic.d05codes;

/*
   Demo of Class Student.java and Grade.java

*/
public class Demo15StudentGrade {
  /** demo. */
  public static void main(String[] args) {
    // object of Class Grade
    Grade grade = new Grade(101, "K-7", "Room 666");
    grade.showGrade();

    // object of Class Student
    Student student = new Student();
    student.stuInfo();

    // object of Class Student
    Student student2 = new Student(1002, "Bella", "Female", 17, new Grade());
    student2.stuInfo();

  } // main
}
