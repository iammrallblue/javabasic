package org.javabasic.d08codes.demo03;

/*
  Static Code Block:
    public class className {
      static {
        // static code block
      }
    }
    Key point:
      when program is executed, the static code block will execute ONLY once.
      and the static code block is preceded over non static variables, methods and constructors.
      which means it will execute at top.
    Usage:
      Used to assign values ​​to static member variables at once

*/
public class Demo13StaticBlock {
  /** Example of Static code block. */
  public static void main(String[] args) {
    // see which is showing first (static code block and Constructor)
    Person person = new Person();
    System.out.println(person);
    // Static code block is executed.
    // Non-parameterized Constructor.
  } // main
}
