package org.javabasic.d20codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
java.io.BufferedReader extends Reader:
  public class BufferedReader:
    Reads text from a character-input stream. buffering characters so as to 
    provide for the efficient reading of characters, arrays, and lines.

    Methods:
      public int read():
        Reads a single character. and return it.
      public int read(char[] cbuf, int off, int len):
        Reads characters into a portion of an array, reading from the underlying stream
        if necessary.
      public void close():
    Constructors:
      public BufferedReader(Reader in):
        Creates a Buffering character-input stream that uses a default-sized
        input buffer.
      public BufferedReader(Reader in, int size):
        Creates a Buffering character-input stream that uses an input buffer
        of the specified size.
    Typical method:
      public String readLine():
        Reads a line of text. A line is considered to be terminated by any one of 
        a line feed ("\n"). 
    USAGE:
} // main
      1. creates an object of BufferedReader, passing character-input stream in Constructor
      2. calls method read() and readLine() to read the character-input
          stream
      3. calls method close() to release and close system source.
  
*/
public class Demo05BufferedReader {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1.
    BufferedReader br = new BufferedReader(new FileReader("temp2.txt"));

    // 2.
    String line = br.readLine(); // read only one line,
    System.out.println(line);

    line = br.readLine();
    System.out.println(line); // read second row

    // 2.1 if read more lines. using while statement
    // b/c loop is unknown
    String line2;
    while ((line2 = br.readLine()) != null) {
      System.out.println(line2);
    }

    // 3.
    br.close();
  } // main
}
