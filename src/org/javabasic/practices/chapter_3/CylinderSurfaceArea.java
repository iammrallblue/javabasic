package org.javabasic.practices.chapter_3;

/*
* Write a method called cylinderSurfaceArea that accepts a radius and height (both real numbers)
* as parameters and returns the surface area of a cylinder with those dimensions.
*/

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        // call cylinderSurfaceArea() method
        double result  = cylinderSurfaceArea(4,8);
        System.out.println("Cylinder Surface Area: " + result);
    } // main

    public static double cylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
    
}