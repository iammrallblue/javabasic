package org.javabasic.d17codes;

/*
  Example of method wait() and notify() from Class Object
    public final void wait() throws InterruptedException
      Causes the current thread to wait until another thread invokes the notify() method or the
      notifyAll() method for this object.
    public final native void notify();
      Wakes up a single thread that is waiting on this object's monitor.
*/
public class Demo04WaitAndNotify {
  public static void main(String[] args) {
    // create lock object of Class Object
    Object lockObject = new Object();

    // create a thread
    new Thread() {
      @Override
      public void run() {
        // while true loop for continuously shopping
        while (true) {
          // make sure to execute ONLY one wait or notify thread
          // by using synchronized()
          synchronized (lockObject) {
            System.out.println("you need to line up to buy cakes.");
            // call wait()
            try {
              lockObject.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            // after notify()
            System.out.println("cakes are ready to serve.");
          }
        }
      }
    }.start();

    // create another thread
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
            lockObject.notify();
          }
        }
      }
    }.start();
  } // main
}
