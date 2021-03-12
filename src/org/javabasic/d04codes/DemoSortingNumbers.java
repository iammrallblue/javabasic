package org.javabasic.d04codes;

import java.util.Scanner;

/*
    Using Class Scanner and If-Statement
    NOTICE:
        If-Else can be nested.
*/
public class DemoSortingNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter Third Number: ");
		int thirdNumber = scanner.nextInt();

		// sorting number from smallest to largest by nested if-else statement
		if (firstNumber >= secondNumber) {
			if (thirdNumber >= firstNumber) {
				System.out.println(secondNumber + ", " + firstNumber + ", " + thirdNumber);
			} else if (thirdNumber <= secondNumber) {
				System.out.println(thirdNumber + ", " + secondNumber + ", " + firstNumber);
			} else {
				System.out.println(secondNumber + ", " + thirdNumber + ", " + firstNumber);
			}
		} else {
			if (thirdNumber >= secondNumber) {
				System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);
			} else if (thirdNumber <= firstNumber) {
				System.out.println(thirdNumber + ", " + firstNumber + ", " + secondNumber);
			} else {
				System.out.println(firstNumber + ", " + thirdNumber + ", " + secondNumber);
			}
		}
		scanner.close();
	} // main
}
