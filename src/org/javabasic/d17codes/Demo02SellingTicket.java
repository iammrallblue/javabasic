package org.javabasic.d17codes;

/*
  Example, Ticket System.
    create three threads to represent three selling windows.
    three selling windows can sell the shared ticket (100)
*/
public class Demo02SellingTicket {
  /** . */
  public static void main(String[] args) {
    // object of RunnableImpl
    RunnableImpl2 impl = new RunnableImpl2();
    // object of Class Thread
    Thread window1 = new Thread(impl);
    Thread window2 = new Thread(impl);
    Thread window3 = new Thread(impl);

    // enable multiple-windows to sell ticket
    window1.start();
    window2.start();
    window3.start();
    // Thread-2The100 ticket is sold.
    // Thread-1The100 ticket is sold.
    //  Thread-1 and Thread-2 sell 100 ticket at the same time.
  } // main
}
