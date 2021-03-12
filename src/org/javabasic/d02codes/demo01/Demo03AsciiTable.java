package org.javabasic.d02codes.demo01;

/*
  Data type: Char
    Char in ASCii table: 
      ASCII: American Standard Code for Information Interchange (number range: 0-127)
      Unicode: has characters more than ASCII, starts from 128

    48 -> '0'
    65 -> 'A'
    97 -> 'a'

*/
public class Demo03AsciiTable {
  /** Demo of ASCII table. */
  public static void main(String[] args) {
    char ch = '1';
    System.out.println(ch + 0); // '1' is 49
    // save 49 in memory not '1'

    char ch2 = 'A';
    System.out.println(ch2); // A
    System.out.println(ch2 + 0); // 65

    char ch3 = 'c';
    System.out.println(ch3); // c
    System.out.println(ch3 + 0); // 99

    // left and right are different
    // char to int, small to big
    // widening conversion
    int var = ch3;
    // int var = (int) ch3
    System.out.println(var); // 99
  } // main
}
