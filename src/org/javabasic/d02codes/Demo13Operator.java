package org.javabasic.d02codes;

public class Demo13Operator {
  /** Compound Operator +=. */
  public static void main(String[] args) {
    int x = 1;
    x += 3; // x = x + 3, result is 4
    System.out.println(x); // 4

    // determine two statements.
    int y = 123;
    int z = 0;
    // z = z * 10 + y % 10; // z = 3;
    // System.out.println(z);
    z *= 10 + y % 10; // z = z * (10 + y % 10)
    // (10 + y % 10) is unity. z *= (10 + y % 10)
    // z *= 10 + y % 10; // is same statement as above?
    System.out.println("z is: " + z); // z is 0

  } // main
}
