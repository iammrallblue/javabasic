package org.javabasic.d03codes;

/*
    Ternary Operator:
        Comparing and finding the max value
        Format:
            condition ? expr1 : expr2
            if true, assigns value of expr1
            if false, assigns value of expr2
*/
public class DemoTernaryOperator {
  public static void main(String[] args) {

    // find the max value b/w 2 numbers
    int x = 20;
    int y = 10;
    int max = (x > y) ? x : y;
    System.out.println("the max value is: " + max); // 20

    // find the max value b/w 3 numbers
    int m = 3;
    int n = 2;
    int z = 4;
    // int max1 = (m > n) ? m : n;
    // int max2 = (max1 > z) ? max1 : z;
    // System.out.println("the max value is: " + max2); // 4

    // combine max1 and max2 to one statement (NOT RECOMMENDED)
    int max3 = (((m > n) ? m : n) > z) ? ((m > n) ? m : n) : z;
    System.out.println("tha max value is: " + max3); // 4

    // if-else statement replace the ternary operator (RECOMMENDED TO USE)
    if (x > y) {
      System.out.println("the max value is: " + x); // 20
    } else if (y > x) {
      System.out.println("the max value is: " + y);
    } else {
      System.out.println("argument ERROR!");
    }

    if (m > n && m > z) {
      System.out.println("the max value is: " + m);
    } else if (n > m && n > z) {
      System.out.println("the max value is: " + n);
    } else if (z > m && z > n) {
      System.out.println("the max value is: " + z); // 4
    } else {
      System.out.println("argument ERROR!");
    }
  } // main
}
