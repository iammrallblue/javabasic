package org.javabasic.d06codes;

/*
  A Student Class:
    keyword static：
      1. can modify instance variable. which means declare a share variable in method area.
          all objects can use it.
        Format:
          objectName.variableName; (NOT RECOMMENDED)
          ClassName.variableName; (Recommended)
      2. a static instance variable is existed with Class
      3. when a object is assigned to null, object still can use static instance variable
      4. CLass is priors to object, therefore, static instance variable is existed longer
          than other non-static variables.
      5. static instance variable can assign value in a static code block
      pro:
        save memory area.

    Static code block:
      1. static instance variable can be assigned values in static code block
      2. static code block will be executed when Class is reloaded at first place.

*/
public class Student5 {
  static {
    address = "Boston";
    System.out.println("static code block is executed.");
  }

  // Fields
  String name;

  // a static instance variable.
  static String address;

  public Student5() {

  }

  public Student5(String name) {
    this.name = name;
  }

  // instance methods.
  /** Non-Static instance method. */
  public void nonStaticMethod() {
    System.out.println("a non-static method belongs to Object.");
  }

  public static void staticMethod() {
    System.out.println("a static method belongs to Class.");
  }
}
