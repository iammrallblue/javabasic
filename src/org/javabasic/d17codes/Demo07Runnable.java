package org.javabasic.d17codes;

/*
  Multiple-threads program by interface Runnable:
    1. through the object of implementation class of interface Runnable
    2. through the anonymous inner class of interface Runnable
    3. directly using constructor of Class THread to 

*/
public class Demo07Runnable {
  public static void main(String[] args) {
    // object of implementation class of interface Runnable
    RunnableImpl4 runnableImpl4 = new RunnableImpl4();
    // create object of Class Thread, pass object of implementation class of
    // interface Runnable by parameterized constructor.
    Thread thread = new Thread(runnableImpl4);
    thread.start(); //

    // simplifying above code by anonymous inner class to
    Runnable runnable = new Runnable() {

      @Override
      public void run() {
        System.out.println("A new thread is created. " + Thread.currentThread().getName());
      }
    };
    new Thread(runnable).start();

    // more simplifying above code by Constructor of Class Thread
    new Thread(new Runnable(){

		@Override
		public void run() {
			System.out.println("2020 new thread is created: " + Thread.currentThread().getName());
		}
      
    }).start();
  } // main
}
