package org.javabasic.d19codes;

import java.io.FileInputStream;
import java.io.IOException;

/*
  java.io.FileInputStream:
    class FileInputStream extends InputStream:
      A FileInputStream obtains input bytes from a file in a file system. 
      What files are available depends on the host environment.
    common instance methods:
      public abstract void close()
        Closes this file input stream and releases any system resources
        associated with the stream.
      public int read()
        Reads a byte of data from this input stream. This method blocks
        if no input is yet available.
      public int read(char[] ch)
        Reads up to ch.length bytes of data from this input stream 
        into an array of bytes. This method blocks until some input is available.
    NOTICE:
      using FileInputSteam will occur unreadable code when reading chinese characters
        (recommended Class FileReader)
*/
public class Demo07ClassFileInputStream {
  /** . */
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("tmp.txt");
    int length = 0;
    while ((length = fis.read()) != -1) {
      System.out.println(length); // 229 166 179 229 165 189 227 128 130

      // casting to char
      // System.out.print((char) length); // å ¦ ³ å ¥ ½ ã
      // since a chinese word has 3 bytes, to read 3 bytes, cannot show
      // the correct chinese word. (recommended FileReader)
    }
    // 3 numbers in a set, b/c the txt file is in UTF-8 format.

    // close and release
    fis.close();
  } // main
}
