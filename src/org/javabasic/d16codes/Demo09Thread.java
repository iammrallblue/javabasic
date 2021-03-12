package org.javabasic.d16codes;

/*
  Main Thread:
    it is the thread for executing main method.

  Single Thread Program: executes from method main to the end.
*/
public class Demo09Thread {
  /** . */
  public static void main(String[] args) {
    Person person = new Person("Bella", 15);
    person.run();

    Person person2 = new Person("Abby", 17);
    person2.run();

    // the result shows that, code is the single thread mode (main thread)
    // which is from main method to the program terminated.
    //
  } // main
}
