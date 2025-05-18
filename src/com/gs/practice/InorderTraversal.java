package com.gs.practice;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;

    }
}

public class InorderTraversal {
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val + " ");

        inorder(root.right);
    }
    public static void main(String[] args){
        TreeNode root =new TreeNode(1);
        root.left = new TreeNode(2);           // Left child of root
        root.right = new TreeNode(3);          // Right child of root
        root.left.left = new TreeNode(4);      // Left child of node 2
        root.left.right = new TreeNode(5);     // Right child of node 2

        // Call the inorder traversal function
        System.out.println("Inorder traversal: ");
        inorder(root); // Expected output: 4 2 5 1 3

    }
}
