package org.javabasic.d19codes;

import java.io.FileWriter;
// import java.io.IOException;

/*
  Example of try...catch...finally  in Class FileWriter:
    Format:
      try {
          code block might occur error
      } catch (IOException ioe) {
        hangling error
      } finally {
        close and release system resource
      }
*/
public class Demo12TryCatch {
  /** . */
  public static void main(String[] args) {
    // without declaring threw exception, we can use try...catch
    FileWriter fw = null;
    try {
      // try: the code block might have errors
      // FileWriter fw = new FileWriter("tmp.txt", true);
      fw = new FileWriter("tmp.txt", true);
      for (int i = 0; i < 10; i++) {
        fw.write("Hello,Bella " + i + "\r\n");
      }
      // fw.close(); // FileWriter object creates outside of try catch statement
      // fw.close() will post IOException
    } catch (Exception e) {
      // catch: catch IOEception
      System.out.println(e); // print out exceptions if any.
    } finally {
      // fw.close() is ONLY available in try scope.
      // to solve try scope issue, creating object of FileWriter outside
      // of the try catch statement.
      // why added if statement b/c object fw will throw NullPointerException if
      // fw is null.
      if (fw != null) {
        try {
          // when method throw an IOException, we need to hangle the exption,
          // therefore, fw.close() method applies another try...catch statement
          /// or threws the exception to method which will call it.
          fw.close();
        } catch (Exception e) {
          System.out.println(e);
          e.printStackTrace();
        }
      }

    }
  } // main
}
