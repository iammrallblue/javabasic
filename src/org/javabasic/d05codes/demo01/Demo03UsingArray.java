package org.javabasic.d05codes.demo01;

public class Demo03UsingArray {
  /** dynamic initializing array. */
  public static void main(String[] args) {
    // dynamic initializing Array the default value of all is 0
    int[] array = new int[3];

    System.out.println(array); // address value [I@6d06d69c
    System.out.println(array[0]); // 0
    System.out.println(array[1]); // 0
    System.err.println(array[2]); // 0

    // assign value to array[1]
    array[1] = 100;
    array[2] = 20;
    System.out.println(array); // address value [I@6d06d69c
    System.out.println(array[0]); // 0
    System.out.println(array[1]); // 0
    System.err.println(array[2]); // 0
  } // main
}
