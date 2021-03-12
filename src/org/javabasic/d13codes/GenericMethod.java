package org.javabasic.d13codes;

/*
  Generic Method:
    Format:
      public <Generic Type> returnType method(argument list<Generic Type>) {
        // body of method
      }
    
      A Generic method MUST determine data type of generic when it is called.
*/
public class GenericMethod {
  // a Generic Method
  public <M> void method(M m) {
    System.out.println("calling a Generic Method.");
    System.out.println(m);
  }
  
  // a static Generic Method
  public static <S> void method02(S s) {
    System.out.println("Calling a Static Generic Method. ");
    System.out.println(s);
  }
}
