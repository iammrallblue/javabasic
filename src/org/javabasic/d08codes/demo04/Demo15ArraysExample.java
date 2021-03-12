package org.javabasic.d08codes.demo04;

import java.util.Arrays;

/*
  java.util.Arrays:
    Class Arrays:
      Common Method:
        public static void sort(char[] ch)
          to use the method sort, have to convert string to char[], 
            Example, to sort a String, and print out reversely by using methods of Class Arrays.
*/
public class Demo15ArraysExample {
  /** Example of Arrays. */
  public static void main(String[] args) {
    String var = "znvnkjhdfkehg";

    char[] chars = var.toCharArray(); // convert String to char[] (one by one)
    Arrays.sort(chars); // sort
    System.out.println(chars); // after sorting result: defghhjkknnvz

    // reverse print out the char[] Array (reverse iteration)
    // for (int i = 0; i < chars.length - 1; i++) {}
    for (int i = chars.length - 1; i >= 0; i--) {
      System.out.print(chars[i]); // print out reversely result: zvnnkkjhhgfed
    }
  }
}