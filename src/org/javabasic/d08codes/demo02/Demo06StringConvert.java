package org.javabasic.d08codes.demo02;

/*
  java.lang
    Class String:
      public char[] toCharArray(), 
      public byte[] getBytes(), 
      public String replace(CharSequence oldString, CharSequence newString)
*/
public class Demo06StringConvert {

  /** . */
  public static void main(String[] args) {

    // char[] toCharArray(), convert a String to char[]
    char[] chars = "Hello".toCharArray();
    System.out.println(chars); // Hello
    System.out.println("The 1st letter is: " + chars[0]); // H
    System.out.println("the length of char[] is: " + chars.length);

    // byte[] getBytes(), convert a String to byte[] (numbers)
    byte[] bytes = "abc".getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]); // 97 98 99, number represent letters.
    }

    // replace(CharSequence oldString, CharSequence newString), to convert a String
    // to
    String string = "How do you do?";
    String string2 = string.replace("o", "8");
    System.out.println("The original String: " + string); // How do you do?
    System.out.println("The replaced String: " + string2); // H8w d8 y8u d8?

    String dirtLang = "Fuck you ChinaJoe";
    String dirtLang2 = dirtLang.replace("Fuck you", "F**k you");
    System.out.println(dirtLang2);
  } // main
}