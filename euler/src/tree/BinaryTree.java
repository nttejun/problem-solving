package tree;

/**
 * Created by nttej on 2017-09-12.
 */

class Node {
    int data;
    Node left;
    Node right;
}

class TreeObject {

    public Node insert(Node node, int val) {

        if(node == null){

            return createNewNode(val);

        }

        if(val < node.data){

           node.left = insert(node.left, val);

        }

        if(val > node.data){

            node.right = insert(node.right, val);

        }

        return node;

    }

    public Node createNewNode(int val){

        Node node= new Node();
        node.data = val;
        node.left = null;
        node.right = null;

        return node;

    }

}

public class BinaryTree {
    public static void main(String[] args){

        TreeObject treeObject = new TreeObject();
        Node root = null;

        root = treeObject.insert(root, 90);
        root = treeObject.insert(root, 3);
        root = treeObject.insert(root, 8);
        root = treeObject.insert(root, 314);
        root = treeObject.insert(root, 100);
        root = treeObject.insert(root, 30);
        root = treeObject.insert(root, 8);
        root = treeObject.insert(root, 45);

    }
}
