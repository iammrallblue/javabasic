package org.javabasic.d08codes.demo02;

/*
  java.lang
    Class String:
      public class String {}
        Key point:
        method:
          public String substring(int index)
            returns a substring of this string.
          public String substring(int begin, int end)
            Returns a string that is a substring of this string. 
            ** [begin, end)
        2. String str = "hello";
           System.out.println(str); // hello
           str = "Bella";
           System.out.println(str); // Bella
           the string str is not changed,
           two "str" means two strings, (two memory hashcode)
           one str is "hello", another "str" is "Bella."
*/
public class Demo05Substring {

  /** Demo of method substring(). */
  public static void main(String[] args) {
    // substring(int index), return a substring
    String string = "HelloWorld";
    String string2 = string.substring(5); // starts from index 5
    System.out.println(string); // result: HelloWorld
    System.out.println(string2); // result: World, index is 5.

    // substring(int begin, int end), return a substring with specified begin and end
    String string3 = string.substring(4, 6);
    System.out.println(string3); // result: oW.

  }
}