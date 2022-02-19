package letcode.easy;

public class LinkedListTypeMergeTwoSortedLists {

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
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    ListNode root = new ListNode();
    ListNode head = root;

    while (!(list1 == null && list2 == null)) {
      int val1 = list1 != null ? list1.val : 101;
      int val2 = list2 != null ? list2.val : 101;

      ListNode newNode = new ListNode();

      if (val1 >= val2) {
        newNode.val = val2;
        list2 = list2.next;
      } else {
        newNode.val = val1;
        list1 = list1.next;
      }
      root.next = newNode;
      root = root.next;
    }
    return head.next;
  }
}
