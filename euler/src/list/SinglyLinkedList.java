package list;

/**
 * Created by nttej on 2017-10-03.
 */
class SinglyLinkedLIst<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    private void addFirst(T inputData) {

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
            addFirst(inputData);
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

    private void add(T index, T inputData) {

        Integer integer = (Integer) inputData;
        Integer indexInteger = (Integer) index;
        indexInteger = indexInteger - 1;

        if (integer == 0) {
            addFirst((T) integer);
        } else {

            Node node = nodeFind((T) indexInteger);
            Node postponeNode = node.pointer;
            Node newNode = new Node(inputData);

            node.pointer = newNode;
            newNode.pointer = postponeNode;
            size++;

            if (newNode.pointer == null) {
                tail = newNode;
            }
        }
    }

    private Node nodeFirstDelete(T inputData) {

        Integer index = (Integer) inputData;

        Node temp = head;

        head = head.pointer;

        Node deleteData = (Node) temp;

        size--;

        return deleteData;

    }

    public String toString() {

        if (head == null) {

            return "[]";

        }

        Node temp = head;

        String result = "[";

        while (temp.pointer != null) {
            result += temp.data + ", ";
            temp = temp.pointer;
        }

        result += temp.data;

        return result + "]";

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
        singlyLinkedLIst.addFirst(10);
        singlyLinkedLIst.addFirst(30);
        System.out.println(singlyLinkedLIst);
        singlyLinkedLIst.add(1, 15);
        singlyLinkedLIst.nodeFirstDelete(30);
        System.out.println(singlyLinkedLIst);
    }

}