package org.javabasic.d05codes;

public class DemoArrayOne {
  public static void main(String[] args) {
    int[] intArray = new int[3];
    System.out.println(intArray); // [I@6504e3b2
    System.out.println(intArray[0]);
    System.out.println(intArray[1]);
    System.out.println(intArray[2]);

    System.out.println("------Assign values to elements of Array ----");

    // assign values to elements of Array
    intArray[1] = 10;
    intArray[2] = 20;
    System.out.println(intArray); // [I@6504e3b2 ** the memory address will not change.
    System.out.println(intArray[0]); // 0
    System.out.println(intArray[1]); // 10
    System.out.println(intArray[2]); // 20

  }
}