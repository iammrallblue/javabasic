package org.javabasic.d12codes;

import java.util.Date;

/*
  java.util.Date
  Class Date:
      Date class represents a specific instant in time, with millisecond precision.
      millisecond can calculate time and date. (1000millisecond = 1second)
          1. Convert time to millisecond.
              System.currentTimeMillis();
          2. Convert millisecond to time or date;
              Day = 24hrs * 60mins * 60sec = 86400sec * 1000 = 86400000millisecond
      Methods:
        public long getTime() {
          return number of milliseconds since January 1, 
          1970, 00:00:00 GMT represented by this date.
        }
      NOTICE:
          Time zones are different. Such as NY is in the Eastern Time +4
          BeiJing is GMT +8
*/

public class Demo04ClassDate {
  /** Class Date and its methods. */
  public static void main(String[] args) {
    showTime();
    show();
    dateMethod();
    dateMethod2();
    dateMethod3();
  } // main

  /** method to show time. */
  public static void showTime() {
    // object of Class Date
    Date date = new Date(); // called Date()
    System.out.println(date); // print out current time

    long millTime = date.getTime();
    System.out.println(millTime); // print out current time in millisecond.

  }

  /** . */
  public static void show() {
    Date date = new Date(0L); // convert millisecond to date
    System.out.println(date);

    Date date2 = new Date(538475874382L);
    System.out.println(date2);
  }

  // 1. using Date() non-parameter Constructor
  private static void dateMethod() {
    Date date = new Date();
    // print out the current time and date.
    System.out.println(date); // Sun Jul 26 21:48:17 EDT 2020
  } // dateMethod()

  // 2. using Date(long date) parameterized Constructor
  private static void dateMethod2() {
    // transmits millisecond as argument, and convert millisecond to date value.
    // 0L is 0 millisecond. time from the epoch (00:00:00 GMT on January 1, 1970)
    Date date2 = new Date(0L);
    System.out.println(date2); // print out the epoch (00:00:00 GMT on January 1, 1970)
  } // dateMethod2()

  // 3. long getTime(), convert date to millisecond and return it as long type,
  // same as System.cureentTimeMillis()
  private static void dateMethod3() {
    Date date3 = new Date();
    long time = date3.getTime();
    System.out.println(time); // 1595815164382 ms
  } // dateMethod3()
}
