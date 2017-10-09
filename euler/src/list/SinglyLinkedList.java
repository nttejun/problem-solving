package list;

/**
 * Created by nttej on 2017-10-03.
 */
class SinglyLinkedLIst<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    private void addNode(T inputData) {

        Node newNode = new Node(inputData);
        newNode.pointer = head;
        head = newNode;
        size++;

        if (head.pointer == null) {
            tail = head;
        }

    }

    public void addBack(T inputData) {

        Node newNode = new Node(inputData);
        if (size == 0) {
            addNode(inputData);
        } else {
            tail.pointer = newNode;
            tail = newNode;
            size++;
        }
    }

    private Node nodeFind(T inputData) {

        Integer index = (Integer) inputData;
        Node temporary = head;

        for (int i = 0; i < index; i++) {

            temporary = temporary.pointer;

        }

        return temporary;

    }

    class Node<T> {

        private T data;
        private Node pointer;

        private Node(T inputData) {
            this.data = inputData;
            this.pointer = null;
        }

    }


    public static void main(String[] args) {

        SinglyLinkedLIst<Integer> singlyLinkedLIst = new SinglyLinkedLIst<>();
        singlyLinkedLIst.addNode(10);
        singlyLinkedLIst.addNode(30);
        System.out.println(singlyLinkedLIst.nodeFind(1));

    }

}