package org.javabasic.d06codes.demo01;

/*
  How to create an instance of a standard class (Student.java):
    1. Import package, specified tha path of class.
        format:
          import org.javabasic.d06codes.Student;
        *** Since the Student Class is in the same package, 
            don't need to import Student Class, it imports by default
    2. create an instance of Student Class.
        format:
          Class  className = new Constructor of Class();
          Student student  = new  Student();
    3. usage of a Class:
        call instance variables, className.instanceVariableName
        call instance methods, className.instanceMethodName(args);
        *** call the variable or methods which you want to call.
    NOTICE:
      same rule as the Array:
        1. byte,short,int have the default value 0
        2. double, float have the default value 0.0
        3. char has the default value '\u0000'
        4. boolean has default value false
        5. reference type has the default value null
*/
public class Demo02Student {
  /** Instance of a Student Class. */
  public static void main(String[] args) {
    // 1. import package, since in the same package, don't need to import.

    // 2. create an instance or object of Student Class
    Student student = new Student();
    // Student() is the no-argument constructor

    // 3. usage of Class:
    System.out.println(student.name); // null
    System.out.println(student.age); // 0
    // not assign value, show default values.

    // assign value to instance variables
    student.name = "Bella";
    student.age = 17;
    System.out.println(student.name); // Bella
    System.out.println(student.age); // 17

    // call instance methods
    student.eat();
    student.sleep();
    student.sweet();
  }
}