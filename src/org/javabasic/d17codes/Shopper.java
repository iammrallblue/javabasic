package org.javabasic.d17codes;

/*
  Class Shopper is a thread can be extended from Class Thread.
*/
public class Shopper extends Thread {
  // fields
  private Cake cake;

  public Shopper(Cake cake) {
    this.cake = cake;
  }

  // override method run for shopping cakes.
  @Override
  public void run() {
    // while loop allows shoppers buying cakes.
    while (true) {
      // ensure ONLY one thread is running
      synchronized (cake) {
        // check cakes inventory
        if (cake.isInStock = false) {
          // shopper thread wait
          try {
            cake.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        // awaken shopper thread, buying cake
        System.out.println(cake.flavor + " Cake " + " in " + cake.cup + " are ready for selling.");
        // when cakes sold out. cake.isInStock == false
        cake.isInStock = false;

        // awaken CakeStore thread to produce more cakes.
        cake.notify();
        System.out.println(cake.flavor + " Cake " + " in " + cake.cup + " are sold out.");
        System.out.println("------- ------ ------- -------");
      }
    }
  }
}
