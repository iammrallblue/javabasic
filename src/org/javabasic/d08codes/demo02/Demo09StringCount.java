package org.javabasic.d08codes.demo02;

import java.util.Scanner;

/*
  Demo of String class:
    to count all characters from Scanner input.
    then classify all kinds of character, and count characters
      category: Upper, Lower, Number, and Others.

    Steps:
      1. Scanner to input a string.
      2. assign input string to String variable.
          String str = scanner.next();
      3. create counter variables for all kind of characters.
      4. check all characters in the string. we need to convert 
          the string to char[] array by method toCharArray()
      5. iterate the char[], using if-statement to determine kinds of characters.
          counters++;
      6. show all results.
    Key point:
      String --> char[] --> char
      String str = scanner.next();
      char[] char = str.toCharArray();
      for loop char[] to char.
*/
public class Demo09StringCount {
  /** Demo of String class. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a sequence of characters: ");
    String str = scanner.next();

    // counters for characters
    int upper = 0;
    int lower = 0;
    int number = 0;
    int other = 0;

    // convert string to a char[] array
    char[] chars = str.toCharArray();
    str.toCharArray();
    // iterate char[] chars;
    for (int i = 0; i < chars.length; i++) {
      char ch = chars[i];
      if (ch > 'A' && ch < 'Z') {
        upper++;
      } else if (ch > 'a' && ch < 'z') {
        lower++;
      } else if (ch > '0' && ch < '9') {
        number++;
      } else {
        other++;
      }
    }

    System.out.println(upper + " Upper Letters.");
    System.out.println(lower + " Lower Letters.");
    System.out.println(number + " Numbers.");
    System.out.println(other + " Others.");

    scanner.close();
  } // main
}