package common;

public class Queue<T> {

  private T[] array;
  private int maxSize;
  private int currentSize;
  private int front;
  private int back;

  public Queue(int size) {
    this.maxSize = size;
    array = (T[]) new Object[size];
    currentSize = 0;
    front = 0;
    back = -1;
  }

  public void enqueue(T val) {
    if (isFull()) {
      return;
    }
    back = (back + 1) % maxSize;
    array[back] = val;
    currentSize++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new NullPointerException();
    }
    T temp = array[front];
    front = (front + 1) % maxSize;
    currentSize--;
    return temp;
  }

  private boolean isEmpty() {
    return currentSize == 0;
  }

  public boolean isFull() {
    return maxSize == currentSize;
  }


}
