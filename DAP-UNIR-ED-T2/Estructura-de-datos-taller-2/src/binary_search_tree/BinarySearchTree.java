package binary_search_tree;

import java.util.List;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null)
            return root;

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    private int minValue(Node root) {
        int minVal = root.value;
        while (root.left != null) {
            minVal = root.left.value;
            root = root.left;
        }
        return minVal;
    }

    public List<Integer> traverseInOrder() {
        return traverseInOrderRec(root, new java.util.ArrayList<>());
    }

    private List<Integer> traverseInOrderRec(Node root, List<Integer> list) {
        if (root != null) {
            traverseInOrderRec(root.left, list);
            list.add(root.value);
            traverseInOrderRec(root.right, list);
        }
        return list;
    }

    public List<Integer> traversePreOrder() {
        return traversePreOrderRec(root, new java.util.ArrayList<>());
    }

    private List<Integer> traversePreOrderRec(Node root, List<Integer> list) {
        if (root != null) {
            list.add(root.value);
            traversePreOrderRec(root.left, list);
            traversePreOrderRec(root.right, list);
        }
        return list;
    }

    public List<Integer> traversePostOrder() {
        return traversePostOrderRec(root, new java.util.ArrayList<>());
    }

    private List<Integer> traversePostOrderRec(Node root, List<Integer> list) {
        if (root != null) {
            traversePostOrderRec(root.left, list);
            traversePostOrderRec(root.right, list);
            list.add(root.value);
        }
        return list;
    }

    public void printInOrder() {
        printInOrderRec(root);
    }

    private void printInOrderRec(Node root) {
        if (root != null) {
            printInOrderRec(root.left);
            System.out.print(root.value + " ");
            printInOrderRec(root.right);
        }
    }
}