package org.javabasic.d18codes;

import java.io.File;

/*
  Class File: java.io.File;
    public class File
      An abstract representation of file and directory pathnames.
      its methods can opt directory and files in the computer.
      such as add folders, files, delete folders, files.
      Static Fields Summary of Class File:
        public static final String pathSeparator:
          The system-dependent path-separator character, represented as a string for convenience.
        public static final char pathSeparatorChar:
          The system-dependent path-separator character.  This field is
          initialized to contain the first character of the value of the system
          property path.separator
        public static final String separator:
          The system-dependent default name-separator character, 
          represented as a string for convenience.
        public static final char separatorChar:
          The system-dependent default name-separator character.  This field is
          initialized to contain the first character of the value of the system
          property file.separator
        
      Notice:
        a file path can be as below:
            windows: C:\aaa\bbb\ccc\d.txt
            linux: /aaa/bbb/ccc/d.txt
          however, if the server environment is unknown (windows? linux? or unix?)
          can write path as below: 
            "C:"+File.separator+"aaa" + File.separator + "bbb" + File.separator + "a.txt"


*/
public class Demo01ClassFile {
  /** . */
  public static void main(String[] args) {
    // pathSeparator
    String pathSeparator = File.pathSeparator;
    System.out.println(pathSeparator); // : linux/macos is ":", windows is ";"

    String separator = File.separator;
    System.out.println(separator); // / linux/macos is "/´", windows is "\"
  } // main
}
