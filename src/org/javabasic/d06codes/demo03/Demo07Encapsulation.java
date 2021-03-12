package org.javabasic.d06codes.demo03;

/*
  Encapsulation in JAVA
    1. A method() is one kind of Encapsulation (See below getMax())
    2. Keyword private is Encapsulation (see Demo08Person.java and Person.java) 

    Encapsulation can hide some detail information, outsider can not see details.
    (See method getMax(), it is a encapsulation in Java)
*/
public class Demo07Encapsulation {
  /** Java Encapsulation. */
  public static void main(String[] args) {

    // Example to find max value in the array
    int[] intArray = { 5, 15, 25, 35, 45, 100 };

    int maxValue = getMax(intArray);
    System.out.println("The max value is: " + maxValue);
    /*
     * int max = intArray[0]; for (int i = 0; i < intArray.length; i++) { if
     * (intArray[i] > max) { max = intArray[i]; } }
     */
    // those steps can be encapsulated in a method()

  }

  /** a method is one kind of Encapsulation. */
  public static int getMax(int[] tempArray) {
    int max = tempArray[0];
    for (int i = 0; i < tempArray.length; i++) {
      if (tempArray[i] > max) {
        max = tempArray[i];
      }
    }
    return max;
  }
  

}