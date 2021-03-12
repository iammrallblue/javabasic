package org.javabasic.d09codes;

/*
  keyword this:
    1. access instance variable, in this Class.
    2. access instance method, inside this Class' method.
    3. access constructor inside another constructor of this Class.
    NOTICE:
      this() to call another constructor MUST be at the first statement 
      of the constructor. ONLY call once.
      super() and this() cannot use both together
  A Subclass inherited from ClassM
*/
public class ClassN extends ClassM {
  // data fields
  int number = 20;

  /** constructor. */
  public ClassN() {
    // super(); //ERROR
    this(333); // call constructor.
    // this(1, 2); //ERROR,
  }

  public ClassN(int tmp) {

  }

  public ClassN(int m, int n) {

  }

  @Override
  public void superMethod() {
    super.superMethod();
    System.out.println("Overrode the Superclass method in Subclass");
  }

  /** . */
  public void showMethod() {
    int number = 10;
    System.out.println(number); // 10 called local variable
    System.out.println(this.number); // 20 using this to call instance variable.
    System.out.println(super.number); // 30 using super to call instance variable.
  }

  // this to call method in this class
  public void method() {
    System.out.println("method in Subclass.");
  }

  public void method2() {
    this.method(); // call method .
    System.out.println("method in Subclass");
  }
}
