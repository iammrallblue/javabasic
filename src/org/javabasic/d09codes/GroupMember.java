package org.javabasic.d09codes;

import java.util.ArrayList;
import java.util.Random;

/*
  A Subclass inherited from Class Members.
*/
public class GroupMember extends Members {

  // constructor
  public GroupMember() {

  }

  public GroupMember(String name, int accBalance) {
    super(name, accBalance);
  }

  /** GroupMember can have a envelope. */
  public void receive(ArrayList<Integer> list) {
    // to get a red envelope.
    int index = new Random().nextInt(list.size());

    int delta = list.remove(index);
    int accBalance = super.getAccBalance();

    super.setAccBalance(accBalance + delta);

  }
}
