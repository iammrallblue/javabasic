package demo;

// import java.util.ArrayList;

public class PopQuiz {
  /** . */
  public static void main(String[] args) {
    System.out.println("Pop Quiz Programming:");
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(1);
    head.next.next.next.next = new Node(2);

    head = getUnique(head);
    printLinkedList(head);
  } // main

  /** . */
  public static Node getUnique(Node head) {
    /* Node cur will point to head */
    Node cur = head;
    Node index = null;
    Node temp = null;

    /* If list is empty then return null */
    if (head == null) {
      return null;
    } else {
      while (cur != null) {
        /* Node temp will point to previous node to index */
        temp = cur;
        /* Node index will point to next node to cur */
        index = cur.next;

        while (index != null) {
          /* If cur node's item is equal to index node's item */
          if (cur.item == index.item) {
            /*
             * Here, index node is pointing to duplicate item , so de-link the index node
             * from the list
             */
            temp.next = index.next;
          } else {

            /* temp will point to previous node of index */
            temp = index;
          }
          index = index.next;
        }
        cur = cur.next;
      }
    }

    return head;

  }

  /** . */
  public static void printLinkedList(Node head) {
    for (Node cur = head; cur != null; cur = cur.next) {
      System.out.println(cur.item + " ");
    }
    System.out.println();
  }
}
