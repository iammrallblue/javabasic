package org.javabasic.d12codes;

import java.util.Calendar;

/*
    abstract Class Calendar:
        is an abstract class that provides methods for converting date between a specific instant 
        in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc. 
        It inherits Object class and implements the Comparable interface.
        
        public abstract class Calendar extends Object   
            implements Serializable, Cloneable, Comparable<Calendar>  

    static Instance Methods:
        public static Calendar getInstance() 
            The getInstance() method of java.util.Calendar class is a Static method. 
            This method is used with calendar object to get the instance of 
            calendar according to current time zone set by java Runtime environment.

 */
public class Demo07ClassCalendar {
  /** . */
  public static void main(String[] args) {
    Calendar cale = Calendar.getInstance(); // Polymorphism
    System.out.println(cale); // based on the result, can see that toString() is Overridden
    /*
    java.util.GregorianCalendar[time=1595872581194,areFieldsSet=true,areAllFieldsSet=true,
    lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,
    dstSavings=3600000,useDaylight=true,transitions=235,
    lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,
    dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,
    startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,
    endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,
    minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,
    DAY_OF_MONTH=27,DAY_OF_YEAR=209,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,
    HOUR=1,HOUR_OF_DAY=13,MINUTE=56,SECOND=21,MILLISECOND=194,ZONE_OFFSET=-18000000,
    DST_OFFSET=3600000] 
    */
  } // main
}