package org.javabasic.d01codes.demo02;

/*
  Variables:
    A Java variable is a piece of memory that can contain a data value. 
    A variable thus has a data type. 
    Data types are covered in more detail in the text on Java data types.
    
    Syntax:
      Data Type variableName; // declare a variable, but unassign value
      variableName = value; // assign value
      OR
      Data Type variableName = value; 
      
    NOTICE:
      1. name of variable CANNOT be repeated.
          int a = 10;
          int a = 20; // ERROR
      2. value range MUST within the range of data type. 
          such as "byte", "short", the range of both is smaller than int and long
      3. unassigned variable CANNOT be used before assigning its value.
          int x;
          System.out.print(x) // ERROR, unassign variable.
*/
public class Demo02Variables {

    /** Demo of Variable. */
    public static void main(String[] args) {
        // 1st way to declare variable
        int value;
        value = 10;
        // print out the value of the variable, not the name of variable
        System.out.println(value);

        // variable can change by requirement
        value = 20;
        System.out.println("Value is changed: " + value);

        // 2nd way to declare variable
        double var = 5.201314;
        System.out.println(var);

        // char data type.
        char c = 'S';
        System.out.println(c);

        // boolean data type.
        boolean b = false;
        System.out.println(b);
    } // main
}
