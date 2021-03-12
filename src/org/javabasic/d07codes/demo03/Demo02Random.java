package org.javabasic.d07codes.demo03;

import java.util.Random;

/*
  Example of Class Random:
    Steps:
      1. declare an int variable var, assigning randomly
      2. using Class Random, import, create object, using.
      3. if range is 10, means 0~9, but requirement is 1~10
          therefore, the whole range needs to add 1. 
          self-define the range of random number random.nextInt(n) +1 [0+1,n+1)
    issue description:
      to set the random number range with in 0 - 5, int n = 5;
      don't want 0 in the set of number?
      
      solution:
        the original range should be [0,n), n = 5;
        to void 0 random.nextInt(n) + 1, which changed
        the range from [0,n) to [0+1, n+1), therefore,
        result will get all numbers with in 1 to 6

*/
public class Demo02Random {
  /** Demo of Random Class. */
  public static void main(String[] args) {
    int n = 5; // the largest range is 5
    Random random = new Random();

    // for(int i = 0; i<50;i++) {
    // int num = random.nextInt(10); // range of number within 10 [0,10)
    // System.out.println(num);
    // }

    for (int i = 0; i < 20; i++) {
      // the original range is [0,n),
      int result = random.nextInt(n) + 1;
      System.out.println(result);
    }
  }

}