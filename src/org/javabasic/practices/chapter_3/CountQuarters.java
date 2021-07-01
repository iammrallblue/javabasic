package org.javabasic.practices.chapter_3;

/*
* Write a method called countQuarters that takes an int representing a number of cents 
* as a parameter and returns the number of quarter coins represented by that many cents.
*/

public class CountQuarters {
    public static void main(String[] args) {
        // call countQuarters() method
        int result = countQuarters(75);
        System.out.println("result: " + result);
    } // main

    public static int countQuarters(int cents) {
        cents = cents % 100;
        return cents / 25;
    }
}
