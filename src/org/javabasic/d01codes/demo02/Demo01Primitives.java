package org.javabasic.d01codes.demo02;
  
/*
  Primitive Data Types:
    Integer: byte short int long
    Float-Point: float double (fraction)
    Character: char
    Boolean: boolean
    Data Type             Size            Description
      byte                1 byte          Stores whole numbers from -128 to 127
      short               2 bytes         Stores whole numbers from -32,768 to 32,767
      int                 4 bytes         Stores whole numbers from -2,147,483,648 to 2,147,483,647
      long                8 bytes         Stores whole numbers from 
                                          -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
      float               4 bytes         Stores fractional numbers. Sufficient for 
                                          storing 6 to 7 decimal digits
      double              8 bytes         Stores fractional numbers. Sufficient for 
                                          storing 15 decimal digits
      boolean             1 bit           Stores true or false values
      char                2 bytes         Stores a single character/letter or ASCII values

    NOTICE:
      1. String: is a Class, which is reference Data Type
          java.lang.String: String class represents character strings.
            public class String {}
      2. double is more precision than float, double is a precision of 
          about 15 digits, which is enough for most purposes.
      3. The range of data types is not necessarily related with number of bytes
          for example, the range of float is wider than the range of long,
          but float is 4 bytes, long is 8 bytes.
      4. The default type of Float-Point is double, 
          if variable needs to declare as float, it needs to add "F" after the value
          float f = 1.2F
      5. The default type of Integer is int, 
          if variable needs to declare as long, it needs to add "L" to the end of the value
          long l = 100L
      6. 
*/
public class Demo01Primitives {
  /** Demo of Primitive Data Type. */
  public static void main(String[] args) {
    // Numbers: 
    // Integer types:
    //  byte, short, int, long

    // byte data type stores (-128 ~ 127)
    byte myByte = 127; // 127 is max value of byte
    System.out.println(myByte);

    // short data type stores (-32768 ~ 32767)
    short myShort = 32767; // 32767 is max value of short
    System.out.println(myShort);

    // int data type stores (-2147483648 ~ 2147483647)
    int myInt = 2147483647; // 2147483647 is max value
    System.out.println(myInt);

    // long data type stores (-9223372036854775808 ~ 9223372036854775807)
    long myLong = 9223372036854775807L; // long value has "L" after value
    System.out.println(myLong);
    
    // Float types:
    //    float, double

    // float data type stores (3.4e−038 ~ 3.4e+038)
    float myFloat = 9.9f; // float value has "f"
    System.out.println(myFloat);

    // double data type stores (1.7e−308 to 1.7e+308)
    double myDouble = 9.9;
    System.out.println(myDouble);
  } // main
}
