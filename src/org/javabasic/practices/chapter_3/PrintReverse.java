package org.javabasic.practices.chapter_3;

/*
* Write a method called printReverse that accepts a String as its parameter 
* and prints the characters in opposite order.
*/

public class PrintReverse {
    public static void main(String[] args) {
        printReverse("Bella");
    } // main

    public static void printReverse(String string) {

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }

}