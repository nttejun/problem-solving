package letcode.easy;

public class LinkedListTypeMergeTwoSortedLists {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null) {
      return list2;
    }

    if(list2 == null) {
      return list1;
    }
    return null;
  }
}
