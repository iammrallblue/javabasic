package org.javabasic.d17codes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl2 implements Runnable {
  // multiple-thread ticket source
  private int ticket = 100;

  // object of Class ReentrantLock (Polymorphism)
  Lock reentrant = new ReentrantLock();
  
  @Override
  public void run() {
    // unknown loop, using while
    while (true) {
      // insert method lock()
      reentrant.lock();
      // check if ticket exist
      if (ticket > 0) {
        // to prevent one ticket sell twice, using sleep()
        try {
          Thread.sleep(30);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        // ticket existed, selling ticket, ticket--
        System.out.println(Thread.currentThread().getName() + " Seat " + ticket + " is sold.");
        ticket--;
      }
      // release lock by method unlock()
      reentrant.unlock();
    }
  } // run()
}
