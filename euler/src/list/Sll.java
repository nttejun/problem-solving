package list;

public class Sll<T> {

  private Node headNode;
  private int size;

  public class Node {
    private Node nextNode;
    private T data;
  }

  public Sll(int size){
    this.headNode = null;
    this.size = size;
  }

  private void insertAtHead(T data) {
    Node node = new Node();
    node.data = data;
    node.nextNode = headNode;
    headNode = node;
    size++;
  }

  private void insertAtEnd(T data) {
    Node newNode = new Node();
    newNode.data = data;

    if(headNode == null){
      insertAtHead(data);
      return;
    }

    Node tempNode = headNode;

    while (tempNode.nextNode != null){
      tempNode = tempNode.nextNode;
    }

    tempNode.nextNode = newNode;
    size++;
  }

  public T deleteAtHead(){
    if(isEmpty()){
      return null;
    }

    Node deleteNode = headNode;
    headNode = headNode.nextNode;
    size--;

    return deleteNode.data;
  }

  private boolean isEmpty() {
    return headNode == null;
  }

  public static void main(String[] args){

    Sll<Integer> sll = new Sll<>(5);
    sll.insertAtEnd(5);
    sll.insertAtEnd(2);
    sll.deleteAtHead();
    System.out.println(sll.headNode);
  }

}


