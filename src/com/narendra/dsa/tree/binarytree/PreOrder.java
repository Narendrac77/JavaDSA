package com.narendra.dsa.tree.binarytree;

//Algorithm Preorder(tree)
//   1. Visit the root.
//   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
//   3. Traverse the right subtree, i.e., call Preorder(right-subtree)
public class PreOrder {

    void printPreOrder(Node node){
        if(node == null)
            return;
        System.out.println(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }
}
