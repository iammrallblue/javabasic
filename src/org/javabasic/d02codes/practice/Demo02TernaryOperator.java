package org.javabasic.d02codes.practice;

import java.util.Scanner;

/*
  Demo of determining whether number EVEN or ODD.
*/
public class Demo02TernaryOperator {
    public static void main(String[] args) {
        // String result = 20 % 2 == 0 ? "number is EVEN" : "number is ODD";
        // System.out.println(result);

        int x = 19;
        int y = 20;
        int max;

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        max = (x > y) ? x : y;
        System.out.println("The max value is: " + max);

        // check scores
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score: ");
        double score = scanner.nextInt();

        String result = (score > 60) ? "pass" : "fail";
        System.out.println("You've got a " + result);

        scanner.close();
    }
}
