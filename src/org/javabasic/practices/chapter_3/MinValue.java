package org.javabasic.practices.chapter_3;

/*
* Write a method called min that takes three integers as parameters 
* and returns the smallest of the three values
*/

public class MinValue {
    public static void main(String[] args) {

    } // main

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}