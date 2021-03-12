package org.javabasic.d07codes.demo03;

import java.util.Random;

/*
  java.util.Random
    Class Random:
      generate numbers randomly 
      public class Random extends Object {}
    Method:
      nextInt(), generating range will be unlimited
                  can be neg, or pos.
      nextInt(int bound), generating range will be with in bound
                  (See code below)
                  nextInt(10), 10 means all number will smaller 10
*/
public class Demo01Random {
  /** Demo of Random Class. */
  public static void main(String[] args) {
    Random random = new Random();
    int var = random.nextInt(); // range is unlimited.
    System.out.println("Radom number is: " + var);

    // random some numbers by for loop
    Random random2 = new Random();
    for (int i = 0; i < 15; i++) {
      int var2 = random2.nextInt(10); // Random number's range is 0~10
      System.out.print(var2 + ", ");
    }
  }
}