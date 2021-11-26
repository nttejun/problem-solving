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

  public Node createNewNode(int val) {

    Node node = new Node();
    node.data = val;
    node.left = null;
    node.right = null;

    return node;

  }

  public Node insert(Node node, int val) {

    if (node == null) {

      return createNewNode(val);

    }

    if (val < node.data) {

      node.left = insert(node.left, val);

    }

    if (val > node.data) {

      node.right = insert(node.right, val);

    }

    return node;

  }


  public void nodeSearch(Node node, int val) {

    if (node == null) {

      System.out.println("Null");

    }

    if (node.data == val) {

      System.out.println("발견 " + node.data);

    }

    if (node.data < val) {

      nodeSearch(node.right, val);

    }

    if (node.data > val) {

      nodeSearch(node.left, val);

    }
  }
}

public class BinaryTree {

  public static void main(String[] args) {

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

    treeObject.nodeSearch(root, 30);

  }
}
