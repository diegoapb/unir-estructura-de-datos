
import java.util.List;

import binary_search_tree.BinarySearchTree;

public class AppTest {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("\nImprimir en orden (inorder)");
        List<Integer> listInOrder = bst.traverseInOrder();
        System.out.println(listInOrder);

        System.out.println("\nImprimir en posorden (postorder)");
        List<Integer> listPostOrder = bst.traversePostOrder();
        System.out.println(listPostOrder);

        System.out.println("\nImprimir en preorden (preorder)");
        List<Integer> listPreOrder = bst.traversePreOrder();
        System.out.println(listPreOrder);

        System.out.println("\nDelete 20");
        bst.delete(20);
        bst.printInOrder();

    }
}
