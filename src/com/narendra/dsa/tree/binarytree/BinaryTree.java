package com.narendra.dsa.tree.binarytree;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPreorder(){
        PreOrder preOrder = new PreOrder();
        preOrder.printPreOrder(root);
    }

    void printInorder(){
        InOrder inOrder = new InOrder();
        inOrder.printInOrder(root);
    }

    void printPostorder(){
        PostOrder postOrder = new PostOrder();
        postOrder.printPostOrder(root);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }


}
