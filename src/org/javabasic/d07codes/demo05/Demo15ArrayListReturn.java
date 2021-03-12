package org.javabasic.d07codes.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
  Demo of ArrayList<> as return value
    random 20 numbers to store in ArrayList<Integer>, then
    select all EVEN numbers from 20 to store in another ArrayList<Integer>
    return the EVEN number ArrayList<>.

  Steps:
    1. an ArrayList<Integer> to store 20 random numbers.
    2. generate 20 numbers by for loop and Random.nextInt(100) + 1; [1,100)
    3. using for loop to add 20 numbers to ArrayList<Integer>
    4. declaring a method to select EVEN number, then store to another ArrayList<>
        1) return value
            return an ArrayList<>
        2) method name: 
            getEvenList()
        3) argument list
            parameter is ArrayList<Integer>
    5. determine 20 numbers whether EVEN or ODD.
          numbers % 2 == 0; 
    6. if number is EVEN number, store to ArrayList<>
*/
public class Demo15ArrayListReturn {
  /** Demo of ArrayList<> as return value. */
  public static void main(String[] args) {
    Random rand = new Random();
    ArrayList<Integer> numberList = new ArrayList<>();
    // generate 20 random number 1 to 100
    for (int i = 0; i < 20; i++) {
      int number = rand.nextInt(100) + 1;
      numberList.add(number);
    }
    System.out.println("20 numbers are: " + numberList);
    
    ArrayList<Integer> evenList = getEvenList(numberList);
    System.out.println("All even numbers out of 20 numbers: ");
    // print out all even number by for loop
    for (int i = 0; i < evenList.size(); i++) {
      System.out.print(evenList.get(i) + ", ");
    }
  } // main

  /** method for check even numbers. */
  public static ArrayList<Integer> getEvenList(ArrayList<Integer> tempList) {
    // create an ArrayLIst<> for all even numbers.
    ArrayList<Integer> evenList = new ArrayList<>();
    for (int i = 0; i < tempList.size(); i++) {
      int temp = tempList.get(i);
      if (temp % 2 == 0) {
        evenList.add(temp);
      }
    }
    return evenList;
  }
}