package org.javabasic.practices.chapter_3;

/*
* Write a method called sphereVolume that accepts a radius (a real number) 
* as a parameter and returns the volume of a sphere with that radius.
*/

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println(sphereVolume(3.3));
    } // main

    public static double sphereVolume(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

}