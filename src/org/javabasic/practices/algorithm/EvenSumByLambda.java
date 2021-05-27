package org.javabasic.practices.algorithm;

import java.util.stream.IntStream;

public class EvenSumByLambda {
  /** adding up even numbers by lambda. */
  public static void main(String[] args) {
    long result = IntStream.range(0, 100).filter(x -> x % 2 == 0).sum();

    System.out.println(result);
  } // main
}
