package org.javabasic.d12codes;

import java.util.Arrays;

/*
  Class System:
    public final class System extends Object
      The System class contains several useful class fields and methods. 
      It cannot be instantiated.

  static Instance Methods:
    1. public static long currentTimeMillis()
        Returns the current time in milliseconds.
    2. public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        Copies an array from the specified source array, beginning at the specified position, 
        to the specified position of the destination array.
        Parameters:
          src - the source array.
          srcPos - starting position in the source array.
          dest - the destination array.
          destPos - starting position in the destination data.
          length - the number of array elements to be copied.
        Practice:
 */
public class Demo10ClassSystem {
  /** . */
  public static void main(String[] args) {
    // public static long currentTimeMillis()
    timeConsuming();

    // public static void arraycopy(Object src, int srcPos, Object dest, int
    // destPos, int length)
    arrayCopy();
  } // main

  private static void arrayCopy() {
    // original array
    int[] src = { 1, 2, 3, 4, 5 };
    // destination array
    int[] dest = { 6, 7, 8, 9, 10 };

    // show Array dest
    System.out.println("before replacement: " + Arrays.toString(dest));
    // before adding: [6, 7, 8, 9, 10]

    // using arraycopy() to add src to dest.
    System.arraycopy(src, 0, dest, 0, 3);
    System.out.println("after replacement: " + Arrays.toString(dest));
    // after adding: [1, 2, 3, 9, 10]

    // using arraycopy() with for loop
    System.arraycopy(src, 0, dest, 1, 4); // copy from src to dest
    for (int i = 0; i < dest.length; i++) {
      System.out.print(dest[i] + " ");
    }
  }

  private static void timeConsuming() {
    // when program started
    long start = System.currentTimeMillis();
    for (int i = 0; i < 999; i++) {
      System.out.println(i);
    }

    long end = System.currentTimeMillis();
    System.out.println("the total elapsed time is: " + (end - start) + "ms");
  }

}
