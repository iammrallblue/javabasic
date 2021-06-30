package org.javabasic.d02codes.demo02;

/*
  USAGE: (3 ways of using addition +)
    1. for integers,  1 + 2
    2. for char, before calculating, char forcedly converts to int
        ASCII, Unicode to check numbers of chars.
    3. for String Class, addition + means join operation. "a" + "b", result is ab;
        see example
 */
public class Demo05Addition {
    /** . */
    public static void main(String[] args) {
        String str = "Bella";
        System.out.println(str);
        String str2 = "831"; // means 520
        String result = str + str2; // join ng str and str2 together.
        System.out.println(result); // Bella831

        // highest-priority of String Class
        System.out.println(str + 8 + 31); // Bella831
        System.out.println(str + (5 + 20)); // Bella25
    } // main
}