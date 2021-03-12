package org.javabasic.d17codes;

/*
  Selling Ticket:
    Selling 100 tickets in three windows

  Solution 1 for thread safety:
    By using synchronized(lock object) {
      // codes in this scope might have thread security issues.
      // codes might be accessed the shared data
    }
    NOTICE:
      1. the locked object can be any object.
      2. MUST sure the locked object is the ONLY object for multiple-threads.
      3. locked object is for ONLY one thread executes in the synchronized code block

  Solution 2 for thread safety:
    By declare a synchronized method
      1. a method stores that codes might be accessed the shared data.
      2. modifier is synchronized
      Format:
        public synchronized void methodName() {
            code block which accesses shared data
        }
*/
public class RunnableImpl implements Runnable {
  // multiple-thread ticket source
  private int ticket = 100;
  // object of
  Object obj = new Object();

  @Override
  public void run() {
    // unknown loop, using while
    while (true) {
      // // sync code block
      // synchronized (obj) {
      // }
      payTicket();
    }
  } // run()
  
  /** . */
  public synchronized void payTicket() {
    // check if ticket exist
    if (ticket > 0) {
      // to prevent one ticket sell twice, using sleep()
      try {
        Thread.sleep(30);
        ;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // ticket existed, selling ticket, ticket--
      System.out.println(Thread.currentThread().getName() + " Seat " + ticket + " is sold.");
      ticket--;
    }
  }
} // RunnableImpl
