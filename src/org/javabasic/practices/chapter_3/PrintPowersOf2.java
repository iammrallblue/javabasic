package org.javabasic.practices.chapter_3;

/*
* Write a method called printPowersOf2 that accepts a maximum number as an argument and prints 
* each power of 2 from 20 (1) up to that maximum power, inclusive.
*/

public class PrintPowersOf2 {
    public static void main(String[] args) {
        printPowersOf2(333);
    } // main

    public static void printPowersOf2(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }

        System.out.println();
    }

}