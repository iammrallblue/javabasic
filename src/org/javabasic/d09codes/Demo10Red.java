package org.javabasic.d09codes;

import java.util.ArrayList;

public class Demo10Red {
  /** . */
  public static void main(String[] args) {

    GroupManager gm = new GroupManager("Owner", 10000);

    GroupMember groupMember = new GroupMember("Bella", 0);
    GroupMember groupMember2 = new GroupMember("Abby", 0);
    GroupMember groupMember3 = new GroupMember("Cath", 0);
    GroupMember groupMember4 = new GroupMember("Danielle", 0);
    
    gm.showBalance();
    groupMember.showBalance();
    groupMember2.showBalance();
    groupMember3.showBalance();
    groupMember4.showBalance();

    // sending
    ArrayList<Integer> redList = gm.send(1234, 4);

    // receiving
    groupMember.receive(redList);
    groupMember2.receive(redList);
    groupMember3.receive(redList);
    groupMember4.receive(redList);

    gm.showBalance();
    groupMember.showBalance();
    groupMember2.showBalance();
    groupMember3.showBalance();
    groupMember4.showBalance();
  } // main
}
