package org.javabasic.d12codes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo09ClassDate {
  /** . */
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date); // Thu Sep 24 10:11:10 EDT 2020
    // System.out.println(date.toLocaleString()); //Sep 24, 2020 10:11:53 AM

    // Format Date
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    String dateFormat = simpleDateFormat.format(date);
    System.out.println(dateFormat);
  } // main
}
