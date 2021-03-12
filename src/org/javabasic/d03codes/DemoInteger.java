package org.javabasic.d03codes;

public class DemoInteger {
  public static void main(String[] args) {
    int num = 187;
    // hundreds digit
    int hundredsDigit = num / 100;
    // tens digit
    int tensDigit = (num % 100) / 10;
    // or int tensDigit = num / 10 % 10
    // units digit
    int unitsDigit = num % 10;
    System.out.println("Hundreds Digit of " + num + " is:  " + hundredsDigit);
    System.out.println("Tens Digit of " + num + " is: " + tensDigit);
    System.out.println("Units Digit of " + num + " is: " + unitsDigit);
  } // maim
}
