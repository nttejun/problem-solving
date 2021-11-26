package list;

public class Sll<T> {

  private Node headNode;
  private int size;

  public class Node {

    private Node nextNode;
    private T data;
  }

  public Sll() {
    this.headNode = null;
    this.size = 0;
  }

  public void insertAtHead(T data) {
    Node node = new Node();
    node.data = data;
    node.nextNode = headNode;
    headNode = node;
    size++;
  }

  public void insertAtEnd(T data) {
    Node newNode = new Node();
    newNode.data = data;

    if (headNode == null) {
      insertAtHead(data);
      return;
    }

    Node tempNode = headNode;

    while (tempNode.nextNode != null) {
      tempNode = tempNode.nextNode;
    }

    tempNode.nextNode = newNode;
    size++;
  }

  public T deleteAtHead() {
    if (isEmpty()) {
      return null;
    }

    Node deleteNode = headNode;
    headNode = headNode.nextNode;
    size--;

    return deleteNode.data;
  }

  public T peek() {
    if (headNode == null) {
      return null;
    }
    return headNode.data;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return headNode == null;
  }

}


