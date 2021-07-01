package org.javabasic.practices.chapter_3;

/* 
* Write a method called vertical that accepts a String as its parameter 
* and prints each letter of the string on separate lines.
*/

public class Vertical {

    public static void main(String[] args) {
        vertical("BellaH.");
    } // main

    public static void vertical(String string) {

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

}