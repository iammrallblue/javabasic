package org.javabasic.d01codes.demo01;

/*
  Constants: (Literals in Java)
    A constant is an entity in programming that is immutable,
    the value that cannot be changed once it'd been assigned. 
    Java doesn't have built-in support for constants.
    Instances:
      1. String Constant: "abc", "13", "&*"
      2. Integer Constant: 1, 2, 200, 40000,
      3. Float Constant: 1.2, 1.22, 5.0
      4. Character Constant: 'A', '$', 'b', '2'
      5. Boolean Constant: true false
      6. Null Constant: null
    to declare any variable as constant with "static" and "final" modifier
      Format:
        static final double THISISCONSTANT = 100.00;
        static final String THIS_IS_STRING = "ABC";
        static final boolean BOOLEAN_VALUE = true;
 */
public class Demo03Constants {
  /** Demo of Constants. */
  public static void main(String[] args) {
    // String Constant
    System.out.println("Bella");
    System.out.println("");

    // Integer Constant
    System.out.println(520);
    System.out.println(-520);

    // Float Constant
    System.out.println(5.20);
    System.out.println(-4.44);

    // Character Constant
    System.out.println('B');
    System.out.println('5');

    // System.out.println(''); // Invalid character constant, empty character
    // literal

    // Boolean Constant
    System.out.println(true + " and " + false);

    // null, cannot print out directly
    // System.out.println(null); // The method println(char[]) is ambiguous for the
    // type PrintStream

  } // main
}
