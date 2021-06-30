package org.javabasic.d02codes;

/*
  Find ones, tens, hundreds of number 123, 
  then sum up ones, tens and hundreds of number 123
*/
public class Demo12OperatorExample {
    /** ones, tens, and hundreds of a number. */
    public static void main(String[] args) {
        int number = 123;

        // ones
        int ones = number % 10;
        System.out.println("ones of 123 is: " + ones);
        int tens = number / 10 % 10;
        System.out.println("tens of 123 is: " + tens);
        int hundreds = number / 100;
        System.out.println("hundreds of 123 is: " + hundreds);
        // sum of ones, tens, and hundreds
        int sum = ones + tens + hundreds;
        System.out.println("the sum of ones, tens, and hundreds is: " + sum);
    }
}
