package org.javabasic.d09codes;

/*
  A Superclass named Members
*/
public class Members {
  
  private String name;
  private int accBalance; // current balance.

  public Members() {

  }
  
  public Members(String name, int accBalance) {
    this.name = name;
    this.accBalance = accBalance;
  }

  // method to show current balance
  public void showBalance() {
    System.out.println(name + "'s balance is: " + accBalance);
  }

  // Setter, Getter
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setAccBalance(int accBalance) {
    this.accBalance = accBalance;
  }

  public int getAccBalance() {
    return accBalance;
  }
}
