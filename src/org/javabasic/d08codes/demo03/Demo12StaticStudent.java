package org.javabasic.d08codes.demo03;

public class Demo12StaticStudent {
  /** How static working in memory.
   *  how to share the static variable room?
   *  when using Class name to call the static variable in the method area
   *  the Class did not get the static variable room from the heap, 
   *  which means static variable does not relate to the object of Class
   *  (see diagram.)
   */
  public static void main(String[] args) {
    Student.room = "Room 101";

    Student student = new Student("Abby", 17);
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println("Room: " + Student.room);

    Student student2 = new Student("Bella", 18);
    System.out.println("Name: " + student2.getName());
    System.out.println("Age: " + student2.getAge());
    System.out.println("Room: " + Student.room);
  }
}