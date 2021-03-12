package org.javabasic.d19codes;

import java.io.FileReader;
import java.io.IOException;

/*
  java.io.Reader
    abstract Class Reader:
      Abstract class for reading character streams, and it's a Superclass of all reading streams.

    Common instance methods:
      public int reader()
      public int reader(char[] ch)
      public abstract void close()
    
    java.io.FileRaeder:
      public class FileReader extends InputStreamReader extends Reader
        Creates a new FileReader, given the name of the file to read from. 
        read file from disk as streams of characters.

      constructors:
        public FileReader(String fileName) 
        public FileReader(File file)
         Parameter: 
          String fileName, path of file
          File file, files
        Usage:
          1. create object of Class FileReader
          2. refer object to the specific file
      Usage of FileReader:
        1. create object of Class FileReader, refer object to the specific file
        2. using method read() to read the file
        3. using method close() to close and release system resource.


*/
public class Demo08ClassReader {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1
    FileReader fr = new FileReader("tmp.txt");

    // 2
    // int length = 0;
    // while ((length = fr.read()) != -1) {
    // // System.out.println(length); //
    // System.out.print((char) length); // #Trump2020, abc
    // }

    // 2
    char[] ch = new char[1024];
    int length = 0;
    while ((length = fr.read(ch)) != -1) {
      /*
       * using constructors of Class String: public String(byte bytes[]): public
       * String(byte bytes[], Charset charset)
       */
      System.out.println(new String(ch, 0, length)); // #Trump2020, abc same result wit Reader.
    }
    // 3
    fr.close();
  } // main
}
