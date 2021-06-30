package org.javabasic.d01codes.demo01;

/*
  Identifier:
    identifier in Java is a sequence of characters of unlimited length
    can include letters and digits, MUST start with letters.
    examples of identifiers
      Class:
        MyClass
      Method:
        myMethod
      Variable:
        var, number, temp, _temp, $temp, string&value,...
*/
public class Demo02Identifier {
    // Class name started with upper letter Demo02Identifier

    /** this is a method. */
    public static void myMethod() {
        // method name started with lower letter
        int var = 1;
        // variable name started wit lower letter var.
        System.out.println(var);
    }

    public static void main(String[] args) {
        myMethod();
    }
}
