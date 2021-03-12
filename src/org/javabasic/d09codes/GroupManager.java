package org.javabasic.d09codes;

import java.util.ArrayList;

public class GroupManager extends Members {

  // constructors
  public GroupManager() {
    // super();
  }

  public GroupManager(String name, int accBalance) {
    super(name, accBalance);
  }

  /** owner needs to send red envelope. */
  public ArrayList<Integer> send(int totalMoney, int count) {
    // ArrayList<Integer> is to store split money.
    ArrayList<Integer> splitList = new ArrayList<>();

    // first to check the balance of the owner
    int ownerBalance = super.getAccBalance();
    if (totalMoney > ownerBalance) {
      System.out.println("Sending failed. Balance is insufficient.");
      return splitList;
    }
    // reduce owner's balance
    super.setAccBalance(ownerBalance - totalMoney);

    // split totalMoney into count
    int avg = totalMoney / count;
    int mod = totalMoney % count; // the module will be put into the last.

    // split into each red envelope
    for (int i = 0; i < count - 1; i++) {
      splitList.add(avg);
    }

    // the last envelope
    int last = avg + mod;
    splitList.add(last);

    return splitList;
  }
}
