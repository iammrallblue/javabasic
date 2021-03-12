package org.javabasic.d02codes.demo01;

/*
  Types Conversion:
    1. Widening or Automatic Conversion
      Widening conversion takes place when two data types are automatically converted. 
      This happens when:
        The two data types are compatible.
        When we assign value of a smaller data type to a bigger data type.
      
        byte -> short -> int -> long -> float -> double
        Example, 
          long amount = 1000;
          value 1000 is int, variable amount is defined as long type.
          it exists the automatic conversion
            long amount = (long)1000;

    2. Narrowing or Explicit Conversion
        If we want to assign a value of larger data type to a smaller data type 
        we perform explicit type casting or narrowing.
          This is useful for incompatible data types where automatic conversion cannot be done.
          Here, target-type specifies the desired type to convert the specified value to.
        notice, char and number are not compilable.
        example,
          int num = 10900L;
          System.out.println(num); //ERROR, 
        Format:
          Data Type(small) variableName(small) = (DataType(small)) value (big);
          int i = (int) 100L;
    NOTICE:
      1. Explicit Conversion is NOT recommended. because it would cause loss of accuracy of data.
        example,
            // Explicit Conversion cause loss of accuracy
            // int number2 = 6000000000; // The literal 6000000000 of type int is out of range 
            int number2 = (int) 6000000000L;
            System.out.println(number2); // result is NOT 6000000000, it is 1705032704
      2. byte, short, char can be applied operators. +, -,
          When byte, short, char +/- with numbers, JVM will change byte, short, 
          char variables to numbers, which are int, then stepping calculation
        example,
          System.out.println(c + 1); // 65, A(65)+1
      3. boolean CANNOT perform data type conversion. ONLY (true, and false)
*/
public class Demo01DataTypeConversion {
  /** . */
  public static void main(String[] args) {
    // Automatic Conversion
    System.out.println(1024); // default type is int
    System.out.println(3.14); // default type is double

    long l = 100L;
    System.out.println(l); // defined type is long.

    long amount = 1000; // 1000 is default int.
    System.out.println(amount); // automatic conversion, int -> long

    double decimal = 5.5F;
    System.out.println(decimal); // automatic conversion, float -> double

    float f = 30L;
    System.out.println(f); // automatic conversion, long -> float

    // Explicit Conversion
    // int i = 100L;
    // System.out.println(i); // Type mismatch: cannot convert from long to int
    int i = (int) 100L;
    System.out.println("long to int: " + i);

    // Explicit Conversion cause loss of accuracy
    // int number2 = 6000000000; // The literal 6000000000 of type int is out of
    // range
    int number2 = (int) 6000000000L;
    System.out.println(number2); // result is NOT 6000000000, it is 1705032704

    int number3 = (int) 3.7;
    System.out.println(number3); // result is 3.

    // byte, short, char can be applied operators. +, -,
    char ch = 'A';
    System.out.println(ch); // result is A
    System.out.println(ch + 1); // 65, A(65)+1
    // char variable can have explicit conversion
    System.out.println((int) ch); // 65
  } // main
}
