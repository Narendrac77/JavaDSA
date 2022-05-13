package com.narendra.dsa.tree.binarytree;

//Algorithm Postorder(tree)
//   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
//   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
//   3. Visit the root.
public class PostOrder {

    void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key + " ");

    }
}
