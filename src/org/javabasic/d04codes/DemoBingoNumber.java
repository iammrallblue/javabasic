package org.javabasic.d04codes;

import java.util.Scanner;

/*
  Random a number, then typing a guessing number to match it.
  NOTICE: 
    Math.random() generate the range of random number [0,1)
    Math.random() * 90：[0,90)  
    Math.random() * 90 + 10：[0,90) + 10 = [10,100)
    (int)(Math.random() * 90  + 10), generate tenth digit random number.
*/
public class DemoBingoNumber {
  /** Random a number, then typing a guessing number to match it. */
  public static void main(String[] args) {
    // generate a number
    int randomNumber = (int) (Math.random() * 90) + 10;
    System.out.println("A random number is produced: " + randomNumber);

    // find the tenth digit, and units digit of the random number
    int randomUnits = randomNumber % 10;
    int randomTenth = randomNumber / 10;

    // guess the generated number
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();

    // find the tenth digit, and units digit of guessed number
    int guessedUnits = guess % 10;
    int guessedTenth = guess / 10;

    //
    if (randomNumber == guess) {
      System.out.println("Bingo, the guessing number is fully matched.");
      System.out.println("You won $10000.");
    } else if (randomUnits == guessedTenth && randomTenth == guessedUnits) {
      System.out.println("Bingo, numbers are matched.");
      System.out.println("You won $3000.");
    } else if (randomUnits == guessedUnits || randomTenth == guessedTenth) {
      System.out.println("Bingo, at least matched one number.");
      System.out.println("You won $1000");
    } else if (randomTenth == guessedUnits || randomUnits == guessedTenth) {
      System.out.println("Bing, the smallest prize is $500. ");
    } else {
      System.out.println("You won nothing.");
    }
    scanner.close();
    System.out.println("The prize number is: " + randomNumber);
  } // main
}
