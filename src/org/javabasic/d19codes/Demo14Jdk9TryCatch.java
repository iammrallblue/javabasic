package org.javabasic.d19codes;

import java.io.FileNotFoundException;

/*
  new feature of try...catch in JDK9:
    creating object of class before try...catch
    directly declare before try statement
      Format:
        A a = new A();
        B b = new B();
        try(a;b) {
          code block might occur error and exception
        } catch (IOException e) {
          System.out.println(e);
        }
*/
public class Demo14Jdk9TryCatch {

  /** . */
  public static void main(String[] args) throws FileNotFoundException {
    // FileInputStream fis = new FileInputStream("tmp2.txt");
    // FileOutputStream fos = new FileOutputStream("tmp.txt");

    // try (fis; fos) {
    // // reading from temp2.txt, and write to tmp.txst
    // int length = 0;
    // while ((length = fis.read()) != -1) {
    // // write to tmp.txst
    // fos.write(length);
    // }
    // } catch (IOException e) {
    // System.out.println(e);
    // }

    // fos.close();
  } // main
}
