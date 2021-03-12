package org.javabasic.d08codes.demo02;

/*
  java.lang
    Class String:
      Common methods of String Class:
        public int length(); to get the length of the String
        public String concat(String str); to joint two String, then return the jointed String
        public char chatAt(int index); to get the specific index char [from 0]
        public int indexOf(String str); 
        public int length(){} to get the length of a String.
        public String concat(String str) to combine two strings into a new String.
        public char charAt() to get the char at specific index. (index 0 to n)
    Key point:
      public String concat(String str), concat two strings.
      ** String is immutable when it is created. but the method concat()
          can joint two string produce a new string.
*/

public class Demo04StringGet {
  /** methods of Class String. */
  public static void main(String[] args) {

    // using length() to get the length of String
    int length = "daldkfskdjfsldsdhfsjhfjdsjfh".length();
    System.out.println("The length of String is: " + length);

    // using concat(String str) to joint two Strings
    String string = "Hello";
    String string1 = " World";
    String string2 = string.concat(string1); // to concat string and string1 together
    System.out.println(string); // Hello
    System.out.println(string1); // World
    System.out.println(string2); // Hello World
    // String is Constant, therefore string2 is a new String object.

    // using chatAt(int index) to return a char value at a specific index.
    char ch = "Hello".charAt(1);
    System.out.println("The 1st index's char value is: " + ch); // result is e

    // using indexOf(String str) method to get a substring.
    String str = "HelloWorld";
    int index = str.indexOf("llo");
    System.out.println("The first index is: " + index);

    // -1 means there is no value
    System.out.println(str.indexOf("abc")); // result -1
  } // main
}