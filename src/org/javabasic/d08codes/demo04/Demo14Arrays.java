package org.javabasic.d08codes.demo04;

import java.util.Arrays;

/*
  java.util
    Class Arrays:
      contains various methods for manipulating arrays (such as sorting and searching)
      public class Arrays {}
      Common Static Methods of Arrays Class:
        public static String toString(Array), convert int[] to a String
        public static void sort(Array), resort the order of an Array
    
    Key point
        to sort integer, ascending from small to big
        to sort string, ascending from a to z.
        to sort self-defined type, using interface Comparable and Comparator.
*/ 
public class Demo14Arrays {
  /** Demo of Class Arrays. */
  public static void main(String[] args) {
    int[] intArray = { 10, 20, 30 };

    // convert int[] to a String by method toString()
    String intString = Arrays.toString(intArray);
    System.out.println(intString); // result [10,20,30]
    
    int[] intArray2 = { 5, 6, 3, 10, 23, 1, 0 };
    Arrays.sort(intArray2); // resort
    System.out.println(Arrays.toString(intArray2)); // [0, 1, 3, 5, 6, 10, 23]

    String[] stringArray = { "Bella", "Dora", "Cathy", "Abby" };
    Arrays.sort(stringArray);
    System.out.println(Arrays.toString(stringArray)); // [Abby, Bella, Cathy, Dora]
  } // main
}