package org.javabasic.practices.chapter_3;

/*
* Write a method called triangleArea that accepts the three side lengths of a triangle 
* (all real numbers) as parameters and returns the area of a triangle with those side lengths. 
* To compute the area, use Heron's formula, which states that the area of a triangle whose
* three sides have lengths a, b, and c
*/

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println(triangleArea(2.2, 3.3, 5.5));
    } // main

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}