package list;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by nttej on 2017-10-03.
 */


class SingleList<T> {

    class Node<T> {

        private Node<T> data;
        private Node next;

        public Node(Node<T> getData) {
            this.data = getData;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }

    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void add(T inputData) {

        Node newNode = new Node((Node) inputData);
        newNode.next = head;
        head = newNode;
        size++;

        if (head.next == null) {
            tail = head;
        }

    }

}


public class SinglyLinkedList {

    public static void main(String[] args) {

        int data = 10;

        SingleList<Integer> inputData = new SingleList<>();

        inputData.add(data);

    }
}