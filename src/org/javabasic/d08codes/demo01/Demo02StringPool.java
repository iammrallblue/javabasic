package org.javabasic.d08codes.demo01;

/*
  Key Point:
    String Constant Pool:
       a separate place in the heap memory where 
       the values of all the strings 
       which are defined in the program are stored.
  For primitive type, using == to compare with the values
  For reference type, using == to compare with the memory address.
*/
public class Demo02StringPool {
  /** Example. */
  public static void main(String[] args) {
    String string = "abc"; 
    String string2 = "abc";

    char[] charArray = { 'a', 'b', 'c' };
    System.out.println(charArray);

    String string3 = new String(charArray);

    System.out.println(string == string2); // true, b/c both have the same memory address
    System.out.println(string == string3); // false, b/c the memory address is NOT same
    System.out.println(string2 == string3); // false, b/c the memory address is NOT same
  }
}