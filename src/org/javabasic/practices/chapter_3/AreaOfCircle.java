package org.javabasic.practices.chapter_3;

/*
 * Write a method named area that accepts the radius of a circle as a parameter
 * and returns the area of a circle with that radius.
 */

public class AreaOfCircle {
    public static void main(String[] args) {
        // call calcArea() method
        System.out.println("Area of a Circle: " + calcArea(5.4));
    }

    public static double calcArea(double radius) {
        return Math.PI * radius * radius;
    }
}