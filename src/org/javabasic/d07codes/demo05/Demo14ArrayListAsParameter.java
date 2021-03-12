package org.javabasic.d07codes.demo05;

import java.util.ArrayList;

/*
  ArrayList<> as parameter.
  Key point:
    1. ArrayList<> used as a parameter.
    2. 3 factors of declaring a method (printArrayList)  
        1) return value
           ONLY print result, NO operation, NO return result, then using void.
        2) method's name
           "printArrayList"
        3) arguments (parameters) 
            since receive an ArrayList, therefore parameter is ArrayList<>
*/
public class Demo14ArrayListAsParameter {
  /** Demo of ArrayList<> as a parameter. */
  public static void main(String[] args) {
    ArrayList<String> nameList = new ArrayList<>();
    nameList.add("Abby");
    nameList.add("Bella");
    nameList.add("Cathy");
    nameList.add("Dora");
    nameList.add("Eva");
    System.out.println(nameList); // print elements in ArrayList

    printArrayList(nameList);
  } // main

  /** A method with parameter ArrayList<>. */
  public static void printArrayList(ArrayList<String> tmpList) {

    // print form {10@20@30}
    System.out.print("{");
    for (int i = 0; i < tmpList.size(); i++) {
      String name = tmpList.get(i);
      // System.out.print(name);
      if (i == tmpList.size() - 1) {
        System.out.print("}");
      } else {
        System.out.print(name + ", ");
      }
    }
  }
}