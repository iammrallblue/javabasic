package org.javabasic.d08codes.demo02;

// public String[] split(String regex)
// regex means regular expression
public class Demo07StringSplit {
  /** . */
  public static void main(String[] args) {

    // String[] split(String regex), to split a String into several parts
    String string = "Hello, Java, Please, Let me in";
    String[] stringArray = string.split(","); // split the string by the rule ","
    for (int i = 0; i < stringArray.length; i++) {
      System.out.println(stringArray[i]);
    }

    // NOTICE:
    String string3 = "XXX.YYY.ZZZ";
    String[] stringArray2 = string3.split("\\."); // \\. is necessary.
    for (int i = 0; i < stringArray2.length; i++) {
      System.out.println(stringArray2[i]);
    }
  } // main
}