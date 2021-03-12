package org.javabasic.d02codes.demo01;

/*
  Narrowing or Explicit Conversion:
    to see detail in Demo01DataType.java
*/
public class Demo02DataTypeConversion {
  /** . */
  public static void main(String[] args) {
    // int varInt = 100L; // 100L is long, long --> int
    // System.out.println(varInt); 
    // Type mismatch: cannot convert from long to int (see below)

    // solution: Type mismatch: cannot convert from long to int
    int var = (int) 100L; // Explicit Conversion
    System.out.println(var);

    // Explicit Conversion (long --> int)
    int var2 = (int) 6000000000L;
    System.out.println(var2); 
    // int is too small for long value 6000000000L
    // print out ONLY 1705032704, that the maximum range of int

    // Explicit Conversion (double --> int)
    int var3 = (int) 3.99; // double, loss of accuracy
    System.out.println(var3); // 3, it's NOT roundup

    // byte, short, char can opt with + or -
    char ch = 'A';
    System.out.println(ch + 1); // 59 + 1
    // ch will convert to int first then + 1

    byte var4 = 40;
    byte var5 = 50;
    // byte + byte --> int + int
    // byte var6 = var4 + var5; // int --> byte, Type mismatch: cannot convert from
    // int to byte
    int var6 = var5 + var4;
    System.out.println(var6); // 90

    short var7 = 60;
    // byte + short --> int + int --> int
    int var8 = var5 + var7;
    System.out.println(var8);

    short var9 = (short) (var5 + var7);
    System.out.println(var9);
  } // main
}