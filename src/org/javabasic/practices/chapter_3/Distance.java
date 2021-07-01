package org.javabasic.practices.chapter_3;

/*
* Write a method called distance that accepts four integer coordinates x1, y1, x2, and y2 as parameters 
* and computes the distance between points (x1, y1) and (x2, y2) on the Cartesian plane. 
*/

public class Distance {
    public static void main(String[] args) {
        double result = distance(1,2,3,4);
        System.out.println(result);
    } // main

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
