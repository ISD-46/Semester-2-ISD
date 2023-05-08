package com.jurnal;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 10, 5, 8, 11, 4, 7};
        BinaryTree tree = new BinaryTree();

        for (int i = 0; i < arr.length; i++)
            tree.insert(arr[i]);

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(tree.root);
    }
}