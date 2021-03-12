package org.javabasic.d08codes.demo04;

/*
  Demo of static methods of Math class.
    Finding all integers between -10.8 to 5.9. 
    that abs values are greater than 6, or 
    less than 2.1.
      ( )
    Steps:
      1. number range is specific, and number of loop is specified 
          using for loop
      2. start point is from -10.8, and it needs convert to -10, (two methods)
          1). call method Math.celi to round up -10.8
          2). implicit cast -10.8 to int, will cut the decimal
      3. each number is integer, iteration expression will be num++, 
          increment each time.
      4. when found out an integer is satisfied, int counter++;
*/
public class Demo17MathExample {

  /** Demo of static methods in Meth Class. */
  public static void main(String[] args) {
    int counter = 0; // count number is satisfied.
    // set up the range of number
    double min = -10.8;
    double max = 5.9;
    // iterate all numbers in the range(min,max)
    for (int i = (int) min; i < max; i++) {
      // get absolute value of all numbers.
      int abs = Math.abs(i);
      if (abs > 6 || abs < 2.1) {
        System.out.print(i + ", ");
        counter++;
      }
    }
    System.out.println("\nFound " + counter + " satisfied integers.");
  } // main
}