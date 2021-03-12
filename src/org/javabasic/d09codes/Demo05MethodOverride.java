package org.javabasic.d09codes;

/*
  Method Override:
    In the inheritance, same method name, same argument list.

  Difference b/w Overload and Override:
    Overload:
      same method name, and DIFFERENT argument list
    Override:
      same method name, and same argument list.
    *** If created an object of Subclass, the prefer to use method from the Subclass.
  
  NOTICE:
    MUST be made sure of the method name and argument list are exactly the same in both
    Superclass and Subclass.

  Format:
    for making sure the method is overridden in Subclass, 
    have to write @Override top of the method, 
    it can detect whether the method is overridden correctly.

    2. the return value of Subclass' method MUST be 
    smaller than the return value of Superclass' method.
    ex. class ClassA {
          public String method() {
            return null;
          }
        }
        class ClassB extends ClassA {
          @Override
          public Object method() { 
            // ERROR, it's larger than the return value's range of the Superclass
            return null;
          }
        }
    3. the access modifier of the Subclass MUST be larger or equal to 
        the Superclass'.
      TIP:
        public > protected > (empty default) > private
*/
public class Demo05MethodOverride {
  public static void main(String[] args) {
    
  } // main
}
