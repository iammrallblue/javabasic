package org.javabasic.d03codes.demo04;

import java.text.DecimalFormat;

/*
  print out hour:minute:second by using nested loop
*/
public class Demo17NestedLoop {
  /** nested loop example. */
  public static void main(String[] args) {
    DecimalFormat formatter = new DecimalFormat("00");
    // this for-loop controls 12-hours.
    for (int hours = 0; hours < 12; hours++) {
      // this for-loop controls 60-minutes.
      for (int minutes = 0; minutes <= 59; minutes++) {
        for (int seconds = 0; seconds <= 59; seconds++) {
          System.out.print(formatter.format(hours) + ":");
          System.out.print(formatter.format(minutes) + ":");
          System.out.print(formatter.format(seconds));
          System.out.println();
        }
      }
    }
  } // main
}
