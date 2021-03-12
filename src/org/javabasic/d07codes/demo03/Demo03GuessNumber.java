package org.javabasic.d07codes.demo03;

import java.util.Random;
import java.util.Scanner;

/*
  Example:
    Random a number, the random number CANNOT be changed, 
    players need to guess the random number;
  
  Steps;
    1. using Class Random to get a random number. (nextInt method)
    2. using Class Scanner to input guessing numbers (nextInt method)
    3. comparing the random number and the guessed number. (if-statement)
        a. if the guessed number is larger, give out warns.
        b. if the guessed number is smaller, give out warns.
        c. bingo, game over.
    4. restart, start over the game.
    since, we don't know how many loops need to take, we have to use while(true)
    if we have to set the time limit, using for loop
*/
public class Demo03GuessNumber {
  /** Demo of Random Class. */
  public static void main(String[] args) {
    Random random = new Random();
    int ranNumber = random.nextInt(100) + 1; // random number b/w [1, 100)
    // random a number for guessing

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Typing your guess number: ");
      int guessNumber = scanner.nextInt(); // type number assigns to variable

      if (guessNumber > ranNumber) {
        System.out.println("Guessing number is too big.");
      } else if (guessNumber < ranNumber) {
        System.out.println("Guessing number is too small.");
      } else {
        System.out.println("Bingo, number is matched.");
        break; // hit the random number using break to exit the loop.
      }
    } // while
    System.out.println("Gave Over");
    scanner.close();
  } // main
}
