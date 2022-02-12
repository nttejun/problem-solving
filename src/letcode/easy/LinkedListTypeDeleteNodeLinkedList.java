package letcode.easy;

public class LinkedListTypeDeleteNodeLinkedList {

  public class ListNode {

    public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
    }

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
