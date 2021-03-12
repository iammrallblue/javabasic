package demo;

public class Hash {

  /** Initialize your data structure here. */
  boolean[] map = new boolean[1000005]; // map is of boolean array

  public Hash() {

  }

  public void add(int key) { // add key to set
    map[key] = true;
  }

  public int remove(int key) { // remove key from set

    if (map[key] == false) // if not present return false
    {

      return -1;
    }
    map[key] = false; // else make it as false
    return 0;
  }

  /** Returns true if this set did not already contain the specified element */
  public boolean contains(int key) {
    return map[key] == true;
  }
}
