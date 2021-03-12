package org.javabasic.d03codes;

public class Demo10WhileLoop {
  /** output numbers that can module by 6 remained 0. */
  public static void main(String[] args) {
    int i = 100;
    while (i <= 999) {
      if (i % 6 == 0) {
        System.out.println(i);
      }
      i++;
    }
  } // main
}
