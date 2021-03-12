package org.javabasic.d19codes;

import java.io.FileWriter;
import java.io.IOException;

/*
  java.io.Writer:
    java.io.OutputStreamWriter:
      java.io.FileWrite:
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
*/
public class Demo10ClassWriter {
  /** . */
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("tmp.txt");

    // public void write(char cbuf[])
    // abstract public void write(char cbuf[], int off, int len)
    char[] ch = { 'B', 'e', 'l', 'l', 'a' };
    fw.write(ch); // write into file
    fw.write(ch, 0, 2);

    // public void write(String str)
    fw.write("lla");

    //public void write(String str, int off, int len)
    fw.write("You had me at-hello", 10, 8);

    fw.close();
  } // main
}
