package org.javabasic.d17codes;

/*
  Lambda
    Format:
      () -> (
        body of code
      )
      3 part os lambda expression
        1 (), argument list from abstract methods of interface. if no args, keep () empty.
        2. -> symbol, means passing args to body of method.
        3. {} a scope of method, such override methods.
  Anonymous Inner Class:
    void to declare an implementation class for interfaces.
    but anonymous inner class expression is a bit complex.

*/
public class Demo08Lambda {
  /** . */
  public static void main(String[] args) {
    // multiple-threads by anonymous inner class
    new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("2020 new thread is created: " + Thread.currentThread().getName());
      }
    }).start();

    // using Lambda expression to implement multiple-threads program.
    new Thread(() -> {
      System.out.println(Thread.currentThread().getName() + " New Thread by Lambda.");
    }).start();

    // optimize Lambda Expression
    new Thread(
        () -> System.out.println(Thread.currentThread().getName()
         + " new thread by optimized lambda expression."))
            .start();
    ;
  } // main
}
