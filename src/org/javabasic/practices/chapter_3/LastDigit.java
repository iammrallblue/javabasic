package org.javabasic.practices.chapter_3;

/*
* Write a method named lastDigit that returns the last digit of an integer. 
*/

public class LastDigit {
   public static void main(String[] args) {
      System.out.println(lastDigit(568));
      lastDigit(568);
   } // main

   public static int lastDigit(int num) {
      return Math.abs(num % 10);
   }

}