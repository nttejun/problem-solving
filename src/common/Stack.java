package common;

/***
 * Node version
 */
public class Stack<T> {

  class Node<T> {

    private T data;
    private Node<T> nextNode;
  }

  private Node headNode;

  public Stack() {
    this.headNode = null;
  }

  public void push(T val) {
    Node node = new Node();
    node.data = val;
    node.nextNode = headNode;
    headNode = node;
  }

  public T pop() {
    if (isEmpty()) {
      throw new NullPointerException();
    }

    T temp = (T) headNode.data;
    headNode = headNode.nextNode;
    return temp;
  }

  public boolean isEmpty() {
    return headNode == null;
  }

  public T peek() {
    return (T) headNode.data;
  }

}

/***
 * List Version
 import java.util.Objects;
 public class Stack<T> {

 private int maxSize;
 private T list[];
 private int top;

 public Stack(int size) {
 this.maxSize = size;
 this.list = (T[]) new Objects[size];
 this.top = -1;
 }

 public void push(T val) {
 if (isFull()) {
 return;
 }
 list[++top] = val;
 }

 public T pop() {
 if (top == -1) {
 throw new NullPointerException();
 }
 return list[top--];
 }

 public T peek() {
 return list[top];
 }

 public boolean isFull() {
 return top == maxSize - 1;
 }

 public boolean isEmpty() {
 return top == -1;
 }
 }
 */