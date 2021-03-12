package org.javabasic.d08codes.demo01;

/*
  java.lang
    Class String:
      a sequence of characters.
      public class String {}
        String str = "abc" == char[] ch = {'a','b','c'};
        1. String is CONSTANT, values CANNOT changed after assigned.
        2. b/c of unchangeable values, the String can be shared. (Save memory)
        3. similar with the char[], but basically it's byte[] Array

    Key Point:
      3 ways to create String variables (3 kinds of String constructors)
        public String() // empty String Array
        public String(char[] chArray) // based on the argument to create an Array
        public String(byte[] byteArray) // based on the argument to create an Array
    *** directly create: 
          String str = "Hello"; // "Hello" is the Object of String Class.
*/
public class Demo01String {

  /** an example to show three constructors of Class String. */
  public static void main(String[] args) {
    // public String() // empty constructor
    String string = new String();
    // string = "Bella";
    System.out.println("The String is: " + string); // result empty String

    // public String(char[] chArray) //
    char[] charArray = { 'A', 'B', 'C', 'D' };
    String string2 = new String(charArray);
    System.out.println("The String is: " + string2); // result ABCD

    // public String(byte[] byteArray)
    byte[] byteArray = { 97, 98, 99 };
    String string3 = new String(byteArray);
    System.out.println("The String is: " + string3); // result abc

    // directly create String
    String string4 = "Hello";
    System.out.println("The String is: " + string4); // result Hello
  }
}