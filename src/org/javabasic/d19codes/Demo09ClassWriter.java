package org.javabasic.d19codes;

import java.io.FileWriter;
import java.io.IOException;

/*
  java.io.Writer:
    Abstract Class Writer for writing to character streams.
    
    Common instance methods:
      public void write(int c)
        Writes a single character and return it.
      public void write(char cbuf[])
        Writes an array of characters
      abstract public void write(char cbuf[], int off, int len)
        Writes a portion of an array of characters.
      public void write(String str)
        Writes a string
      public void write(String str, int off, int len)
        Writes a portion of a string. 
      abstract public void flush()
        flushes the stream,
      public abstract void close()
        closes the stream, flushing it first.

    java.io.FileWriter extends OutputStreamWriter extends Writer
      Class FileWriter:
        Convenience class for writing character files.

        Constructors of Class FileWriter:
          public FileWriter(File file)
            Constructs a FileWriter object given a File object.
          public FileWriter(String fileName)
            Constructors a FileWriter object given a file name with a boolean
            indicating whether or not append the data written.
            Parameter:
              String fileName, path of file
              File file, files.
          Usage:
            1. create an object of FileWriter
            2. creating objects based on the specific files.
            3. refers object to the specific files.
    Usage of Class FileWriter:
      1. creating object of Class FileWriter, determining the location (path)
      2. calling method write() to write data to the memory buffer. 
          (processing of characters to bytes )
      3. calling method flush() to refresh data in the memory buffer to the file.
      4. calling method close() to close and release system resource, which is writing
          data to the file.
      Differences of close() and flush():
        flush() to store data from memory to file, but data still remain in memory
        close() to store data form memory to file first, 
        but data will be destroyed from memory
*/
public class Demo09ClassWriter {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1.
    FileWriter fw = new FileWriter("tmp.txt");

    // 2. 
    fw.write(98); // write b into tmp.txt

    // 3. 
    fw.flush(); // tmp.txt content is changed.

    // 4. 
    fw.close();
  } // main
}
