package org.javabasic.d10codes.demo01;

/*
  This is an Interface:
    Any version of Java can declare abstract methods.
      public abstract void absMethod();

  NOTICE:
    1. "public and abstract" is fixed keyword: public abstract.
          which means cannot use like "private abstract"
    2. public and abstract can omit. 
        such as 
          abstract void absMethod(); 
        it is still correct.
          public void absMethod(); correct.
          or 
          void absMethod(); correct
*/
public interface MyInterfaceAbstract {
  // abstract method
  public abstract void absMethod();

  // abstract method w/o public
  abstract void absMethod2();

  // abstract method w/o abstract
  public void absMethod3();

  // abstract method w/0 public and abstract
  void absMethod4();

} // interface
