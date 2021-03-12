package org.javabasic.d08codes.demo02;

/*
  java.lang
    Class Object
  Key Point:
    1. "==" is for comparing the memory hashcode of objects.
    2. to compare values of objects, using two methods
        1) public boolean equals(Object obj){}
        2) public boolean equalsIgnoreCase(Object obj){}
    3. Object class can receive any type objects.
    4. method equals(), a.equals(b) is same as b.equals(a).
    5. see below.
  NOTICE:
    string5 variable: 
      recommended form "constant".equals(variable);
      NOT recommended. b/c when string5 = null;, ERROR,NullPointerException
*/

public class Demo03StringEquals {
  /** equals() and equalsIgnoreCase(). */
  public static void main(String[] args) {
    String string = "String";
    String string2 = "String";
    char[] charArray = { 'S', 't', 'r', 'i', 'n', 'g' };
    String string3 = new String(charArray);

    // comparing values of string, string2, string3. NOT memory hashcode.
    System.out.println(string.equals(string2)); // true
    // compare both String values, same return true, NOT same return false
    System.out.println(string2.equals(string3)); // true, b/c values are the same.

    System.out.println(string3.equals("String")); // true

    System.out.println("String".equals(string)); // true

    String string4 = "hello";
    System.out.println(string4.equals(string)); // false, case sensitive

    String string5 = "abc";
    System.out.println("abc".equals(string5));
    System.out.println(string5.equals("abc"));

    String string6 = "ABC";
    System.out.println(string6.equals(string5)); // false b/c Case sensitive.
    System.out.println(string6.equalsIgnoreCase(string5));
    // true, b/c us equalsIgnoreCase to void Case sensitive
  }
}