package letcode.easy;

public class LinkedListTypeCycle {
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    if (head == null || head == null) {
      return false;
    }

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}
