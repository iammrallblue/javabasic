package org.javabasic.d12codes;

public class Demo11StringBuilder {
  /** . */
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    System.out.println("object of StringBuilder is empty" + builder);

    // adding by using append(), append method has no return value
    StringBuilder builder2 = builder.append("Bella ");
    System.out.println("builder is appended: " + builder); // Bella
    System.out.println("builder2 is appended: " + builder2); // Bella

    // compare both builders
    System.out.println(builder == builder2); // true

    // method chaining
    builder.append("Abby ").append("Bella ").append("Cath ").append("Danielle ").append("Eva ");
    System.out.println(builder);

    // reverse 
    builder.reverse();
    System.out.println(builder);

    StringBuffer builder3 = new StringBuffer("Ms.Bella, ");
    builder3.append("You are beautiful.");
    System.out.println(builder3);

    String str = builder3.toString();
    System.out.println(str);
  } // main
}
