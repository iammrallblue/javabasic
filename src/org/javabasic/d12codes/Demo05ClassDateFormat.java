package org.javabasic.d12codes;

// import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*  
  abstract Class DateFormat:
      public abstract class DateFormat extends Format {}

  Usage:
      Format Date to Text, or Parse Text to Date Format.

  Methods:
      // format Date value to a String (text).
    1.public final String format(Date date)
      {
          return format(date, new StringBuffer(),
              DontCareFieldPosition.INSTANCE).toString();
      }

      // parse a string (text) to date format
    2.public Date parse(String source) throws ParseException {
          ParsePosition pos = new ParsePosition(0);
          Date result = parse(source, pos);
          if (pos.index == 0)
              throw new ParseException("Untraceable date: \"" + source + "\"" ,
                  pos.errorIndex);
          return result;
      }
  
  NOTICE: 1. DateFormat is an abstract Class, cannot directly instantiate it,
              using its Subclass or Implementation Class to invoke it which is SimpleDateFormate.
          
          2.  public Date parse(String source) throws ParseException {
              }
              parse() declared an exception called ParseException, need to get rid of the exception,
              throws or try...catch{}

  java.text.SimpleDateFormat:
      Constructors:
        public SimpleDateFormat(String pattern){
            this(pattern, Locale.getDefault(Locale.Category.FORMAT));
        }
        1. Create Object of SimpleDateFormat(String pattern)
        2. parameter: String pattern, a specified pattern is defined to transmit value.
        3. specified pattern is case sensitive. (see Class SimpleDateFormate Date and Time Patterns)
            y       Year
            M       Month in year (context sensitive)
            d       Day in month 
            H       Hour in day (0-23)
            m       Minute in hour
            s       Second in minute
            S       Millisecond
          Example:
            "yyyy-MM-dd HH:mm:ss"
            "MM/dd/yyyy HH:mm:ss"
*/
public class Demo05ClassDateFormat {
  public static void main(String[] args) {
    method();
    // method2();
  } // main

  // calling methods in Class DateFormat by creating Object of SimpleDateFormat
  private static void method() {
    SimpleDateFormat simpleFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    // Specified pattern

    Date date = new Date();
    // get a current time string
    System.out.println(date); // Sun Jul 26 12:43:53 EDT 2020 default Date format

    // 1. calling format(Date date) to convert Date to Specified pattern
    // convert current Date formate to specified pattern
    String dateText = simpleFormat.format(date);
    System.out.println(dateText); // Specified pattern 07/26/2020 10:27:09
  }

  // private static void method2() throws ParseException {
  // SimpleDateFormat simpleFormat2 = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
  // // Specified pattern

  // // parse() return a Date type value
  // Date date2 = simpleFormat2.parse("07-26-2020 10:27:09");
  // System.out.println(date2);
  // }
}
