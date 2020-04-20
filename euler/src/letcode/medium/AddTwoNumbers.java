package letcode.medium;

import list.Sll;
import org.junit.Test;

public class AddTwoNumbers {
  public Sll addTwoNumbers(Sll l1, Sll l2) {

    int size = getSizeMax(l1, l2);

    String numList1 = "";
    String numList2 = "";

    for (int i = 0; i < size; i++){

      if(l1.peek() != null){
        numList1 += l1.peek();
        l1.deleteAtHead();
      }

      if(l2.peek() != null){
        numList2 += l2.peek();
        l2.deleteAtHead();
      }

    }

    int res = Integer.parseInt(numList1) + Integer.parseInt(numList2);

    Sll resSll = new Sll();
    for(int i = 0; i < String.valueOf(res).length(); i++){
      resSll.insertAtHead(String.valueOf(res).charAt(i));
    }
    return resSll;

  }

  private int getSizeMax(Sll l1, Sll l2) {
    if(l1.getSize() < l2.getSize())
      return l2.getSize();
    return l1.getSize();
  }

  private String printListNode(Sll sll){
    String res = "";
    for(int i = 0; i < sll.getSize(); i++){
      res += sll.peek();
      sll.deleteAtHead();
    }
    return res;
  }

  @Test
  public void addNum(){

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    Sll s1 = new Sll();
    s1.insertAtHead(2);
    s1.insertAtHead(4);
    s1.insertAtHead(3);

    Sll s2 = new Sll();
    s2.insertAtHead(5);
    s2.insertAtHead(6);
    s2.insertAtHead(4);

    // 807
    Sll s3 = addTwoNumbers.addTwoNumbers(s1, s2);
  }
}
