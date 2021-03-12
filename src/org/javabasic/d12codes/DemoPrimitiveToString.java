package org.javabasic.d12codes;

/*
  The Primitive types and String:
    primitive type --> String
      1. primitive type + "", the most simplest way
      2. using static method in the Wrapper Class.
        public static String toString(int i)
          Returns a String object representing the specified integer. 
          The argument is converted to signed decimal representation and 
          returned as a string, exactly as if the argument and 
          radix 10 were given as arguments to the toString(int, int) method.
          Parameters:
            i - an integer to be converted.
          Returns:
            a string representation of the argument in base 10.
            Returns a String object representing the specified integer.

      3. using static method in the Class String.
          public static String valueOf(int i)
            Returns the string representation of the int argument.
            The representation is exactly the one returned by the Integer.
            toString method of one argument.
            Parameters:     
              i - an int.
            Returns:
              a string representation of the int argument.         
  
    String --> primitive type
      1. using static Method "parseInt(String s) in Wrapper Class
        public static int parseInt(String s) throws NumberFormatException
          Parses the string argument as a signed decimal integer. 
          The characters in the string must all be decimal digits, 
          except that the first character may be an ASCII minus 
          sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign 
          '+' ('\u002B') to indicate a positive value. The resulting integer value is returned, 
          exactly as if the argument and the radix 10 were given as arguments 
          to the parseInt(java.lang.String, int) method.
          Parameters:
              s - a String containing the int representation to be parsed
          Returns:
              the integer value represented by the argument in decimal.
          Throws:
              NumberFormatException - if the string does not contain a parsable integer.
 */
public class DemoPrimitiveToString {
  /** . */
  public static void main(String[] args) {
    // Primitive type --> String
    // primitive value + ""
    String str = 100 + ""; // String value
    System.out.println(str + 200); // 100200

    // 2. toString(int i) in Wrapper Class
    String str2 = Integer.toString(200); // str2 is String value
    System.out.println(str2 + 400); // 200400

    // 3. valueOf(int i) in Class String
    String str3 = String.valueOf(400);
    System.out.println(str3 + 800); // 400800

    // String --> Primitive type
    // parseInt(String s) in Wrapper Class
    int i = Integer.parseInt("1000"); // parse "1000" to int 
    System.out.println(i + 2000); // int + int = 3000
  } // main
}