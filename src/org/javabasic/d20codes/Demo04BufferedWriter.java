package org.javabasic.d20codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* 
  java.io.BufferedWriter:
    public class BufferedWriter extends Writer
      Class BufferedWriter, a character-output stream.
        Writes text to a character-output stream, buffering characters so as to
        provide for the efficient writing of single characters, arrays, and strings.
      Methods inherited from Superclass Writer:
        public void write(int c):
          Writes a single character. the character to be written is contained in the 16
          low-order bits of the given integer value. the 16 high-order bits are ignored.
        public void write(String str):
          Writes a String.
          String str, a String to be written.
        public void write(String str, int off, int len):
          Writes a portion of a String
          str, a String. off, offset from which to start writing characters
          len, Number of characters to write
        public void write(char cbuf[]):
          Writes an array of characters.
        public void write(char cbuf[], int off, int len):
          Writes a portion of an array of characters.
          cbuf[], array of characters. off, offset from which to start writing characters.
          len, number of characters to write
        public void flush():
          flushes the stream.
        public void close():
          close and release the system source.
      Constructors:
        public BufferedWriter(Writer out)
          Creates a buffered character-output stream that uses a default-sized output buffer.
          Writer out, A Writer. to enhance writing speed.
        public BufferedWriter(Writer out, int size)
          Creates a new buffered character-output stream that uses an output buffer of
          the given size.
          int size, specific size of buffer.
      Typical method:
        public void newLine():
          Writes a line separator. The line separator string is defined by the
          system property line.separator not equal '\n' character.
      USAGE:
        1. creats an object of BufferedWriter for writing to a character-output stream.
        2. writes data into character-output stream.
        3. calls method flush()
        4. calls method close()
*/

public class Demo04BufferedWriter {
  /** . */
  public static void main(String[] args) throws IOException {
    // 1
    BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));
    // 2
    for (int i = 0; i < 10; i++) {
      bw.write("Hello, Bella.");
      // bw.write("\r\n");
      // method newLine() replace "\n\r"
      bw.newLine(); // line separator.
    }
    // 3
    bw.flush();
    // 4
    bw.close();
  } // main
}
