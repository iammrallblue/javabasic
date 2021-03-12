package demo;

public class Main {
  public static void main(String[] args) {
    Hash h = new Hash();
    h.add(1);
    h.add(2);
    int x = h.remove(3);
    if (x == -1)
      System.out.println("Hey value does not exist at all");
    boolean t = h.contains(2);

    if (t == false)
      System.out.println("Hey nothing there");
    else
      System.out.println("Hey value is there");

  }
}