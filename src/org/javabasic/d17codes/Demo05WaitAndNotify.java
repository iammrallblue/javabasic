package org.javabasic.d17codes;

/*
  Class Object:
    methods of Object:
      wait()
      wait(long, int)
      wait(long)
      notify()
      notifyAll()
  Two methods to switch to "Time Waiting".
    1. using method sleep(long millis) from Class Thread.
    2. using method wait(long millis) from Class Object.
        if thread did not wake up by any methods like notify()
        the thread will wake up itself.
    awaken methods:
      void notify();
        Wakes up a single thread that is waiting on this object's monitor.
      void notifyAll();
        Wakes up all threads that are waiting on this object's monitor.
*/
public class Demo05WaitAndNotify {
  public static void main(String[] args) {
    // create lock object of Class Object
    Object lockObject = new Object();

    // create a thread (Shopper 1)
    new Thread() {
      @Override
      public void run() {
        // while true loop for continuously shopping
        while (true) {
          // make sure to execute ONLY one wait or notify thread
          // by using synchronized()
          synchronized (lockObject) {
            System.out.println("Shopper 1, you need to line up to buy cakes.");
            // call wait()
            try {
              lockObject.wait(5000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            // after notify()
            System.out.println("cakes are ready to serve for Shopper 1.");
          }
        }
      }
    }.start();

    // create a thread (Shopper 2)
    new Thread() {
      @Override
      public void run() {
        // while true loop for continuously shopping
        while (true) {
          // make sure to execute ONLY one wait or notify thread
          // by using synchronized()
          synchronized (lockObject) {
            System.out.println("Shopper 2, you need to line up to buy cakes.");
            // call wait()
            try {
              lockObject.wait(5000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            // after notify()
            System.out.println("cakes are ready to serve for Shopper 2.");
          }
        }
      }
    }.start();

    // create another thread (CakeStore)
    new Thread() {
      @Override
      public void run() {
        // while loop for continuously producing cakes
        while (true) {
          // need mins to prepare cakes
          try {
            Thread.sleep(4000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          synchronized (lockObject) {
            // cakes are ready to-go
            System.out.println("your cakes are ready.");
            // lockObject.notify(); // method notify() ONLY wakes up one random thread.
            // when multiple-threads are wait for their orders, using method notifyAll()
            lockObject.notifyAll();
          }
        }
      }
    }.start();
  } // main
}
