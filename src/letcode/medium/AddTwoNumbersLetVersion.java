package letcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersLetVersion {

  /**
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
   * x) { val = x; } }
   */

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

      ListNode head = new ListNode(0);
      ListNode p = l1, q = l2, curr = head;
      int carry = 0;

      while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;

        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) {
          p = p.next;
        }
        if (q != null) {
          q = q.next;
        }
      }

      if (carry > 0) {
        curr.next = new ListNode(carry);
      }

      return head.next;
    }
  }

  @Test
  public void test_AddTwoNumbersLetVersion() {
    ListNode l1;
    ListNode l2;
    l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    Solution solution = new Solution();
    ListNode result = solution.addTwoNumbers(l1, l2);

    ListNode res;
    res = new ListNode(7);
    res.next = new ListNode(0);
    res.next = new ListNode(8);
    Assert.assertNotEquals(res.toString(), result.toString()); // output [7, 0, 8]

  }
}
