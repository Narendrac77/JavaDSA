package com.narendra.dsa.tree.binarytree;

//Algorithm Inorder(tree)
//   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
//   2. Visit the root.
//   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
public class InOrder {

    void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.println(node.key + " ");
        printInOrder(node.right);
    }

}
