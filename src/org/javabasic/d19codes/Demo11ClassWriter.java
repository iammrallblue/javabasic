package org.javabasic.d19codes;

import java.io.FileWriter;
import java.io.IOException;

/*
  Append and Tab:
      java.io.Writer:
    java.io.OutputStreamWriter:
      java.io.FileWrite:
        Abstract Class Writer for writing to character streams.
        
    contractors of FileWriter:
      public FileWriter(File, file, boolean append)
        Constructs a FileWriter object given a File object. appending content is after
        previous data. (NOT overwrite)
      public FileWriter(String fileName, boolean append)
        Constructs a FileWriter object given a file name with a boolean
        indicating whether or not to append the data written.

*/
public class Demo11ClassWriter {
  /** . */
  public static void main(String[] args) throws IOException {
    // public FileWriter(File, file, boolean append)
    FileWriter fr = new FileWriter("tmp.txt", true);
    fr.write("放蕩不羈的野");

    fr.flush();

    fr.close();

    // public FileWriter(String fileName, boolean append)
    FileWriter fr2 = new FileWriter("tmp.txt", true);
    fr2.write("\n");
    fr2.write("another good day. keep digging.");

    fr2.flush();

    fr2.close();

  } // main
}
