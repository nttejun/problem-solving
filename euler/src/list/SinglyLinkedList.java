package list;

/**
 * Created by nttej on 2017-10-03.
 */
class SinglyLinkedLIst<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    private void addNode(T inputData) {
        Node newNode = new Node((Node) inputData);
        newNode.pointer = head;
        head = newNode;
        size++;
    }

    class Node<T> {

        private Node<T> data;
        private Node pointer;

        private Node(Node<T> inputData) {
            this.data = inputData;
            this.pointer = null;
        }
    }


    public static void main(String[] args) {

        int inputData = 10;

        SinglyLinkedLIst<Integer> singlyLinkedLIst = new SinglyLinkedLIst<>();
        singlyLinkedLIst.addNode(inputData);

    }

}