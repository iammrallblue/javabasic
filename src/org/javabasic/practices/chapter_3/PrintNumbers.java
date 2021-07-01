package org.javabasic.practices.chapter_3;

/*
* Write a method called printNumbers that accepts a maximum number as a parameter and prints each 
* number from 1 up to that maximum, inclusive, boxed by square brackets.
*/

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(34);
    } // main

    public static void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("[");
            System.out.print(i);
            System.out.print("] ");
        }

        System.out.println();
    }

}