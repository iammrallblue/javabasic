package org.javabasic.d12codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    Calculate days since birth by Class Date and its methods.

    Steps:
        1. using next() in Class Scanner to get date of birth
        2. using parse() in Class DateFormat to parse the String to Date format
        3. convert date to millisecond,
        4. get current time and convert to millisecond.
        5. take current millisecond - date millisecond.
        6. millisecond to day
*/
public class Demo06DatePractice {
  /** . */
  public static void main(String[] args) throws ParseException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your date of birth, format (mm/dd/yyyy): ");
    String birthdayString = scanner.next(); // get birthday date

    // creates object of SimpleDateFormat to call parse() to convert
    // SimpleDateForm is Subclass of abstract Class DateFormat
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyyy");
    Date birthdayDate = simpleDateFormat.parse(birthdayString);
    long birthdayDateTime = birthdayDate.getTime(); // convert birthday date to millisecond

    long todayTime = new Date().getTime(); // get current date (today) to millisecond

    long days = todayTime - birthdayDateTime; // current date - birthday date
    System.out.println(days / 1000 / 60 / 60 / 24); // show days you have been born.

    scanner.close();
  } // main
}