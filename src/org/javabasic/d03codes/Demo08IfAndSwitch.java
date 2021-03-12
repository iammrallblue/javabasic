package org.javabasic.d03codes;

import java.util.Scanner;

/*
  Practice both If-Statement, and Switch Statement
    1. Check Ticket Deal.
        two different ticket: business seat, and economy seat.
    2. Based on grade to obtain reward from parent.
        equals to 100 or higher, a benz
        above 90 or higher, a laptop
        above 60 or higher, a cellphone
        below 60, get a smack.
    3. Convert a number into a day of a week.
        any number to (Mon - Sun).

*/
public class Demo08IfAndSwitch {
  /** examples. */
  public static void main(String[] args) {
    // ticketDeal2();
    // getReward2();
    dayOfWeek();
  } // main

  /** check ticket deal by if-else statement. */
  public static void ticketDeal() {
    // since airline business has peak season and low season
    // the deal is relate to the business peak and low
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input month of travel ticket: ");
    int month = scanner.nextInt();
    System.out.println("Input the type of ticket: (business or economy)");
    String ticket = scanner.next();
    if (month >= 4 && month <= 10) {
      if (ticket.equals("business")) {
        System.out.println("It's a peak season.");
        System.out.println("business class ticket 10% off.");
      } else if (ticket.equals("economy")) {
        System.out.println("It's a peak season.");
        System.out.println("economy class ticket 20% off. ");
      }
    } else {
      if (ticket.equals("business")) {
        System.out.println("business class ticket 50% off.");
      } else if (ticket.equals("economy")) {
        System.out.println("economy class ticket 60% off.");
      }
    }
    scanner.close();
  } // ticketDeal

  /** check ticket deal by if and switch. */
  public static void ticketDeal2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a month: ");
    int month = scanner.nextInt();
    System.out.println("Input a type of ticket: (business or economy)");
    String ticket = scanner.next();
    // nested if
    if (month >= 4 && month <= 10) {
      switch (ticket) {
        case "economy":
          System.out.println("peak season, economy class ticket is 20% off.");
          break;
        case "business":
          System.out.println("peak season, business class ticket is 10% off.");
          break;
        default:
          System.out.println("please check you ticket type again.");
          break;
      }
    } else if (month >= 1 && month <= 12) {
      switch (ticket) {
        case "economy":
          System.out.println("low season, economy class ticket is 60% off.");
          break;
        case "business":
          System.out.println("low season, business class ticket is 50% off.");
          break;
        default:
          System.out.println("please check you ticket type again.");
          break;
      }
    } else {
      System.out.println("Check your month again.");
    }
    scanner.close();
  } // ticketDeal2

  /** get a reward by grade (using if-statement). */
  public static void getReward() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your score: ");
    int score = scanner.nextInt();
    if (score >= 100 && score <= 105) {
      System.out.println(score + " you can have a benz as reward.");
    } else if (score >= 90 && score <= 99) {
      System.out.println(score + " you can have a laptop as reward.");
    } else if (score >= 60 && score <= 89) {
      System.out.println(score + " you can have a cellphone as reward.");
    } else if (score <= 59) {
      System.out.println(score + " you will get a smack.");
    } else {
      System.out.println("you don't even have a score.");
    }
    scanner.close();
  } // getReward

  /** get a reward by grade (using switch). */
  public static void getReward2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your score: ");
    int score = scanner.nextInt();
    // since score is too large, when using it as condition of switch statement.
    // have to divide score by 10,
    // condition can accept byte,short,int,char, String, and enum.
    // add explicit conversion to score, to prevent float, or double vales.
    switch (score / 10) {
      case 10:
        System.out.println(score + " you can have a benz as reward.");
        break;
      case 9:
        System.out.println(score + " you can have a laptop as reward.");
        break;
      case 8:
      case 7:
      case 6:
        System.out.println(score + " you can have a cellphone as reward.");
        break;
      default:
        System.out.println(score + " you will get a smack.");
        break;
    }
    scanner.close();
  } // getReward2

  /** Input a number to convert to a day of week. */
  public static void dayOfWeek() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number (1-7) to represent Mon-Sun: ");
    int day = scanner.nextInt();
    System.out.println("today is " + day);
    System.out.println("Input a number to represent the number of days: ");
    int number = scanner.nextInt();
    System.out.println("the number of days that you want to add in: " + number);
    System.out.println("today + add in number will be the: " + ((day + number) % 7));
    scanner.close();
  } // dayOfWeek
}
