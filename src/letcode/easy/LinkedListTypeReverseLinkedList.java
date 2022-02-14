package letcode.easy;

public class LinkedListTypeReverseLinkedList {

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public ListNode reverseList(ListNode head) {
      ListNode parent = null;
      while (head != null) {
        ListNode current = head;
        head = head.next;
        current.next = parent;
        parent = current;
      }
      return parent;
    }
  }
}