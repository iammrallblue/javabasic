package org.javabasic.d03codes.demo04;

/*
  keyword: continue
    it can continue the loop, but stop processing the remainder of the code in its
    body for this particular iteration.
    instance:
      skipping number 4

  Comparison:
    break is stop the whole loop
    continue is stop current processing, continue to finish the loop.
*/
public class Demo15Continue {
  /** skip the number which is no needed to show. */
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i); // the result did not contain 4.
    }
  } // main
}
