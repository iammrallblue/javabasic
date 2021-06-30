package org.javabasic.d02codes.practice;

import java.util.Scanner;

public class Demo14TernaryOperator {
    /** determine a number whether EVEN or ODD. */
    public static void main(String[] args) {
        // String result = 43 % 2 == 0 ? "EVEN" : "ODD";
        // System.out.println(result);

        // determine a number if bigger than 0, then print
        // out 1, smaller than 0 print out -1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        int var = number > 0 ? 1 : number < 0 ? -1 : 0;
        // return a value 1, -1, or 0 to variable var.

        if (var == 1) {
            System.out.println(number + " number is greater than 0.");
        } else if (var == -1) {
            System.out.println(number + " number is less than 0.");
        } else if (var == 0) {
            System.out.println(number + " number is 0.");
        }
        scanner.close();
    } // main
}
