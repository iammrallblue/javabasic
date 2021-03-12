package org.javabasic.d07codes.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
  Demo of ArrayList<E>:
    generate 6 int values within range 1 to 33,
    create an ArrayList<Integer> to add all int values
    iterate ArrayList<Integer> by for-each statement

*/
public class Demo12ArrayListExample {
  /** Demo of ArrayList<>. */
  public static void main(String[] args) {
    // create a collection to store numbers
    ArrayList<Integer> numList = new ArrayList<>();
    // generate numbers by Random class
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
      int value = random.nextInt(32) + 1; // [0+1),[32+1]
      numList.add(value);
    }
    System.out.println("ArrayList<Integer> has: " + numList);

    // iterate numList
    System.out.println("for each statement printing out ArrayList<>:");
    for (int number : numList) {
      System.out.print(number + ", ");
    }

    // iterate numList
    System.out.println("\nfor loop statement printing out ArrayList<>");
    for (int j = 0; j < numList.size(); j++) {
      System.out.print(numList.get(j) + ", ");
    }
  } // main
}