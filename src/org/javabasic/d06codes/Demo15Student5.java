package org.javabasic.d06codes;

public class Demo15Student5 {
  /** Demo of Student5 Class. */
  public static void main(String[] args) {
    // Student5 stu = new Student5();
    // Student5 stu2 = new Student5("Bella");
    // System.out.println(stu + " + " + stu2);
    // access a static instance variable
    // best way to access call ClassName.variableName
    // System.out.println(Student5.address); //
    // System.out.println(Student5.address);

    // when stu = null. object stu still can access the static variable.
    // stu = null;
    // System.out.println(stu.apddress); // Atlanta
    // no NullPointerException.
    System.out.println(Student5.address); // Boson
    System.out.println(Student5.address);
  } // main
}
