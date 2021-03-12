package org.javabasic.d12codes;

/*
  Wrapper Class:
    Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    The table below shows the primitive type and the equivalent wrapper class:      
      Primitive Data Type Wrapper Class
      byte          Byte
      short         Short
      int           Integer*
      long          Long
      float         Float
      double        Double
      boolean       Boolean
      char          Character*

  Autoboxing:
    Autoboxing is the automatic conversion that the Java compiler makes between 
    the primitive types and their corresponding object wrapper classes. 
    For example, converting an int to an Integer, a double to a Double, 
    and so on. If the conversion goes the other way, this is called unboxing.
    ex. int --> Integer, which means Integer is a wrapper class:
        
      Constructor and Description
        Integer(int value)
          Constructs a newly allocated Integer object that represents the specified int value.
        Integer(String s)
          Constructs a newly allocated Integer object that represents the int value indicated 
          by the String parameter.
    static Instance Methods:
        public static Integer valueOf(int i)

        public static Integer valueOf(String s)
  Unboxing: 
    Converting an object of a wrapper type (Integer) to 
    its corresponding primitive (int) value is called unboxing. 
    
    The Java compiler applies unboxing when an object of a wrapper class is:
        Passed as a parameter to a method that expects a value of the corresponding primitive type.
        Assigned to a variable of the corresponding primitive type.

        Instance Method:
          public int intValue()
            Returns the value of this Integer as an int.
          Specified by:
            intValue in class Number
          Returns:
            the numeric value represented by this object after conversion to type int.
*/
public class Demo12WrapperClass {
  /** . */
  public static void main(String[] args) {

    // Autoboxing, wraps up the primitive type to its corresponded wrapper class.
    // Integer integer = new Integer(1); // autoboxing
    // System.out.println(integer); // 1, toString() is overridden.

    // // 2.
    // Integer integer2 = new Integer("1"); // autoboxing
    // System.out.println(integer2); // 1, toString() is Overridden.

    // 3. static Integer valueOf(int i)
    Integer integer3 = Integer.valueOf(3);
    System.out.println(integer3); // 3

    // 4. static Integer valueOf(String s)
    Integer integer4 = Integer.valueOf("4");
    System.out.println(integer4);

    // Unboxing, Wrapper Class to the primitive type (int)
    int i = integer4.intValue();
    System.out.println("Wrapper Class to Primitive type (int): " + i);

    int value = integer3.intValue();
    System.out.println(value);
  } // main
}
