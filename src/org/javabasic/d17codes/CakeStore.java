package org.javabasic.d17codes;

/*
  Class CakeStore: (a thread class can extends from Class Thread)
    it produce cakes when it receive any orders.
  NOTICE:
    the relationship of Cake and CakeStore threads is synchronized.
    which means have to use the method synchronized() to ensure ONLY one thread working at time.
    lock object MUST unique, lock object can be object of Class Cake.
    object of Cake can be the parameter for the object of CanStore and
    the object of shopper.
      1. need a Cake variable in instance variable's position.
      2. need a parameterized constructor to assign value for Cake variable
*/
public class CakeStore extends Thread {
  // field
  // 1.
  private Cake cake;

  // 2.
  public CakeStore(Cake cake) {
    this.cake = cake;
  }

  // producing Cake by method run()
  @Override
  public void run() {
    // declare count variable
    int count = 0;
    // add while loop to make CakeStore continuous producing
    while (true) {
      // need to ensure ONLY one thread running
      synchronized (cake) {
        // check cake's stock
        if (cake.isInStock == true) {
          try {
            // the object calls method() wait or notify() MUST be lock Object.
            // cake is lock object " see synchronized(cake)"
            cake.wait(); 
          } catch (InterruptedException e) {
            e.printStackTrace();
          } // if there has cake in stock
        }
        // if stock is empty, need to produce cakes
        // count % 2 == 0 make CakeStore to produce vary cakes.
        if (count % 2 == 0) {
          // produce vanilla cake
          cake.flavor = "vanilla";
          cake.cup = "cup";
        } else {
          // produce orange cake
          cake.cup = "cup";
          cake.flavor = "orange";
        }
        count++;
        System.out.println("Producing Cake: " + cake.flavor + " Cake in " + cake.cup);
        // producing cake needs about 5 seconds
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        // when producing is finished.
        cake.isInStock = true;

        // awaken shopper thread to buy cakes
        cake.notify();
        System.out.println("Fresh" + cake.flavor + " Cakes are ready to sell. ");
      }
    }

  }
}
