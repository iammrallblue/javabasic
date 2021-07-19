package org.javabasic.d05codes.demo01;

// import java.util.Arrays;

/*
  Array:
    A container for storing many values.
  
    1. Array is a reference type
    2. An array ONLY can store one data type.
    3. the length cannot change while the program executing.



    NOTICE:
      Dynamic initialization is specified the length of an Array
        Format:
          int[] intArray = new int[1]; 1 is the specified length.
      Static initialization is specified the content of an Array.
        Format:
          int[] intArray = new int[] {1,2,4,....};
          or 
          int[] intArray = {1,2,3,....};
*/
public class Demo01Array {
    /** Demo of Array. */
    public static void main(String[] args) {
        // // initializing an int array, which can store 300 int values
        // int[] intArray = new int[300];
        // // String string = intArray.toString(); // print out a string presenting Array intArray
        // String str = Arrays.toString(intArray);
        // // System.out.println(string); // [I@2a139a55
        // System.out.println("what is the result: " + str);

        // initializing a double array, which can store 10 double values
        // double[] doubleArray;
        // doubleArray = new double[10];
        // System.out.println(doubleArray.toString());
        // // String str = Arrays.toString(doubleArray);

        // // initializing a String array, which can store 5 String values
        // String[] stringArray = new String[5];
        // System.out.println(stringArray.hashCode());

        // static initializing array
        int[] intArray2 = new int[] { 1, 3, 4, 5 };
        System.out.println(intArray2);
        for (int i = 0; i < intArray2.length; i++) {
            System.out.print(intArray2[i] + ", ");
        }
        // int[] intArray2 = new int[] { 1, 3, 4, 5 };
        // static initializing array cannot split into 2 part
        // such as int[] intArray2;
        // intArray2 = {1,2,3...}

        // simple way to declare a static initializing array
        String[] stringArray2 = { "Hello", "Bella", "!" };
        System.out.println(stringArray2);
    } // main
}
