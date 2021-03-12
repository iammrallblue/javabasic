package org.javabasic.d09codes.demo07;

/*
  Key point:
    Constructor in the Inheritance:
      the Super Constructor will be called first.
  
  1. Because the Subclass is inherited from the Superclass
      therefore, it will call the constructor of Superclass
      even there no super keyword involved. 
      but there has an invisible super() inside of the constructor of Subclass.
      that's why the constructor of the Superclass is executed first.
  2. therefore, super() can call the Superclass' constructor (Overloaded constructor ) 
      in the Subclass. (see ClassI and ClassJ)

  3. IMPORTANT, super() can call constructors of Superclass, 
      it MUST be the first statement in the Subclass constructor,
      and ONLY call once. 
  Therefore, super() is for calling Superclass' constructors, if it does not appear
  the complier will default a super() to the Subclass' Constructor.
*/
public class Demo07Constructors {
  /** Demo of Constructor in Inheritance. */
  public static void main(String[] args) {
    Subclass sbc = new Subclass();
    sbc.toString();
    // result
    // call Superclass constructor
  } // main
}
