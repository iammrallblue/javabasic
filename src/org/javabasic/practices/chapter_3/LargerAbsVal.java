package org.javabasic.practices.chapter_3;

/*
* Write a method called largerAbsVal that takes two integers as parameters 
* and returns the larger of the two absolute values.
*/

public class LargerAbsVal {
    public static void main(String[] args) {

    } // main

    public static int largerAbsVal(int a, int b) {
        return Math.max(Math.abs(a), Math.abs(b));
    }

}
