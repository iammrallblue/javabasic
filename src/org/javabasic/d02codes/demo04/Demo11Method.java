package org.javabasic.d02codes.demo04;

/*
  Method:
    how to declare methods:
      public static void method() {}
      public void method() {}
      public int method()
    
    NOTICE:
      1. orders of methods are NOT necessary. can be unordered.
      2. each method is independent, cannot declare one method inside of another method.
      3. a method won't execute by itself, calling a method to execute it.
    how to call methods:
      format:
        method();
          see codes inside of main method.
*/
public class Demo11Method {
  /** Demo of Method. */
  public static void main(String[] args) {
    // invoking methods
    chef();
    farmer();
    vegiCompany();
    customer();
  } // main method

  /*
   * How to declare a simple method Format: public static void methodName() {},
   * This is a simple method called. {method body in side no limits}.
   * 
   * Example, Vegetables from farm to table, how many people will deal with it?
   * Farmers, Vegetable Companies, Markets, Chefs, Customers. Each of individuals
   * can create a method to represent itself.
   */
  /** farmer method. */
  public static void farmer() {
    System.out.println("What farmers should do:");
    System.out.println("Seeding");
    System.out.println("Watering");
    System.out.println("Fertilization");
    System.out.println("Good Harvest");
    System.out.println("Selling");
  }

  /** Vegetable company method. */
  public static void vegiCompany() {
    System.out.println("What Vegi companies should do: ");
    System.out.println("Buying from farmers");
    System.out.println("Delivering to markets");
    System.out.println("Selling to customers or restaurants");
  } // vegi company method

  /** chef method. */
  public static void chef() {
    System.out.println("What chefs should do: ");
    System.out.println("Washing Vegetables");
    System.out.println("Cutting up Vegetables");
    System.out.println("Cooking");
    System.out.println("Plating up");
    System.out.println("Serving");
  } // chef method

  /** customer method. */
  public static void customer() {
    System.out.println("What customers should do: ");
    System.out.println("Eating");
    System.out.println("Paying");
  } // customer method
}