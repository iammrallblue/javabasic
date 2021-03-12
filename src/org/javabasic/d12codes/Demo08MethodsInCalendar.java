package org.javabasic.d12codes;

import java.util.Calendar;
import java.util.Date;

/*
  Common Instance Methods in Class Calendar:
    1. public int get(int field) 
        fields pass as parameter, fields return as parameter.
    2. public void set(int field, int value)
        Sets the specified calendar field by the specified value.
    3. public abstract void add(int field, int amount) 
        Adds or subtracts the specified amount of time to the given calendar field
    4. public final Date getTime()
        This method gets the time value of calendar object and Returns date.

  Parameters in Instance Methods:
    int field: 

  Constant:
    public static final int YEAR = 1;
    public static final int MONTH = 2;
    public static final int DATE = 5;
    public static final int DAY_OF_MONTH = 5;
    public static final int HOUR = 10;
    public static final int MINUTE = 12;
    public static final int SECOND = 13;
 */
public class Demo08MethodsInCalendar {
  /** . */
  public static void main(String[] args) {
    getMethod();
    setMethod();
    addMethod();
    getTimeMethod();

  } // main

  // 1. using int get(int field)
  private static void getMethod() {

    // get Object of Calendar by the getInstance()
    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR); // to get year
    System.out.println(year);

    int month = calendar.get(Calendar.MONTH); // to get month
    System.out.println(month + 1);

    // int date = calendar.get(Calendar.DATE); // to get date
    int date = calendar.get(Calendar.DAY_OF_MONTH); // to get date
    System.out.println(date);
  } // getMethod()

  // 2. using public void set(int field, int value)
  private static void setMethod() {

    // object of abstract Class Calendar
    Calendar calendar = Calendar.getInstance();

    // set a specific year by calling set(int field, int value)
    calendar.set(Calendar.YEAR, 2045);

    // print out new set year value.
    int setYear = calendar.get(Calendar.YEAR);
    System.out.println(setYear);

    // set a specific month by calling set(int field, int value)
    calendar.set(Calendar.MONTH, 9);

    // print out new set year value
    int setMonth = calendar.get(Calendar.MONTH);
    System.out.println(setMonth);

    calendar.set(Calendar.DATE, 27);
    int setDate = calendar.get(Calendar.DATE);
    System.out.println(setDate);

    // set year, month, date at same time
    calendar.set(2018, 01, 01);

  } // setMethod()

  // 3. public abstract void add(int field, int amount)
  private static void addMethod() {

    Calendar calendar = Calendar.getInstance();

    // add 2 to year
    calendar.add(Calendar.YEAR, 2);
    calendar.add(Calendar.MONTH, -3);
    calendar.add(Calendar.DATE, 1);

    // print out new set year value.
    int setYear = calendar.get(Calendar.YEAR);
    System.out.println(setYear); // +2, 2022

    // print out new set year value
    int setMonth = calendar.get(Calendar.MONTH);
    System.out.println(setMonth);

    int setDate = calendar.get(Calendar.DATE);
    System.out.println(setDate);

  } // addMethod()

  // 4. public final Date getTime()
  private static void getTimeMethod() {

    Calendar calendar = Calendar.getInstance();
    Date time = calendar.getTime();
    System.out.println(time);
  } // getTime()
}