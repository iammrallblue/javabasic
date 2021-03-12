package org.javabasic.d19codes;

import java.io.FileOutputStream;
import java.io.IOException;

/*
  appending, keeping adding data to files without deleting previous data by 
  Constructor of Class FileOutputStream:
    public FileOutputStream(String name, boolean append)
      Creates a file output stream to write to the file with the specified name.
    public FileOutputStream(File file, boolean append)
      Creates a file output stream to write to the file represented by the specified File object. 
    Parameters of Constructors:
      String name, File file, means the path of the file, like destination that data goes.
      boolean append:
         if true, then bytes will be written to the end of the file rather than the beginning.
         append not delete saved data.
         if false, will create a new file in a specified path.
    How to add new data to a new line?
      Windows: \r\n
      Linux: \n
      macOS: \r
*/
public class Demo03Superaddition {
  /**
   * Appending new data to files.
   */
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("temp2.txt", true);
    fos.write(" Hello,Bella, ".getBytes());
    fos.write("\r".getBytes());

    // adding data to new lines.
    for (int i = 0; i < 3; i++) {
      fos.write("You had me at-hello.".getBytes());
      fos.write("\r".getBytes());
    }
    fos.close();
  } // main
}
