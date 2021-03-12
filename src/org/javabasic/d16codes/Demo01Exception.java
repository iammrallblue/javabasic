package org.javabasic.d16codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  Class Throwable:
    public class Throwable extends Object
  
  two direct Subclasses of Class Throwable:
    1. Class Error:
        public class Error extends Throwable
    2. Class Exception:
        public class Exception extends Throwable
        It happens when code in compiling, such as,
        caused by user error, others by programmer error, 
        and others by physical resources that have failed in some manner.

      ** RuntimeException: (aka Unchecked Exception)
        (RuntimeException is Subclass of Class Exception)
          public class RuntimeException extends Exception
            the RuntimeException that occurs at the time of execution. 
            These include programming bugs, such as logic errors or improper use of an API. 
            RuntimeExceptions are ignored at the time of compilation.
    3. Class Error:
        public class Error extends Throwable
          Errors − not exceptions at all, 
          but can arise beyond the control of the user or the programmer. 
          Errors are typically ignored in your code because you can rarely do anything 
          about an error.

*/
public class Demo01Exception {
  /**
   * methods to solve exceptions.
   * 
   */
  public static void main(String[] args) throws ParseException {
    // Class Exception, how to handle exceptions
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy");
    Date date = dateFormat.parse("01.01.1991"); // Unhandled exception type ParseException
    System.out.println(date); // Tue Jan 01 00:00:00 EST 1991

    // RuntimeException
    int[] array = { 1, 2, 3 };
    System.out.println(array[0]); // 1
    // System.out.println(array[3]); // RuntimeException,
    // ArrayIndexOutOfBoundsException
    // try... catch to solve RuntimeException
    try {
      // code might pop out RuntimeException
      System.out.println(array[3]);
    } catch (Exception e) {
      System.out.println(e);
      // java.lang.ArrayIndexOutOfBoundsException: 3
    }

    // ERRORS, rarely do anything about them, cannot be fixed.
    // OutOfMemoryError: java Heap Space
    // java.lang.NegativeArraySizeException
    // int[] array2 = new int[555555555 * 300000000 * 900000000 * 1009090909 *
    // 909090909];
    int[] array2 = new int[100 * 100];
    // after catch the RuntimeException, program will execute till finish
    System.out.println(array2[0]);
    System.out.println("Finish..");
  } // main
}
