package org.javabasic.d20codes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
  example:
    to convert a file format from GBK to UTF-8
  STEPS:
    1. declares object of InputStreamReader, passing byte input stream as argument
        and specified charset as GBK
    2. declares object of OutputStreamWriter, passing byte output stream as argument
        and specified charset as UTF-8, 
    3. calls method read() from Class InputStreamReader to read file.
    4. calls method writer from Class OutputStreamWriter to write and convert content.
    5. calls method close() to close and release system source.
*/
public class Demo09Transcoding {
  public static void main(String[] args) throws IOException {
    // 1.
    InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "GBK");

    // 2.
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_to_utf8.txt"), "UTF-8");

    // 3.
    int length = 0;
    while ((length = isr.read()) != -1) {
      //System.out.print(length);
      // 4.
      osw.write(length); // write into a new file, and a new format
    }

    // 5.
    osw.close();
    isr.close();
  } // main
}
