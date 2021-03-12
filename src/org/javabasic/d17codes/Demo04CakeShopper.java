package org.javabasic.d17codes;

public class Demo04CakeShopper {
  public static void main(String[] args) {
    Cake cake = new Cake();
    // create CakeShop thread to produce cakes
    new CakeStore(cake).start();
    // create Shopper thread to buy cakes
    new Shopper(cake).start();
  } // main
}
