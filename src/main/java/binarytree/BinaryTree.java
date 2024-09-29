package binarytree;

import java.util.Arrays;

public class BinaryTree {
    public static BinaryTreeNode createBinaryTree(int[] array) {
        if (array.length == 0) return null;
        if (array.length == 1) return new BinaryTreeNode(array[0]);

        int mid = array.length / 2;
        BinaryTreeNode root = new BinaryTreeNode(array[mid]);
        root.leftChild = createBinaryTree(Arrays.copyOfRange(array, 0, mid));
        root.rightChild = createBinaryTree(Arrays.copyOfRange(array, mid + 1, array.length));
        return root;
    }

    public static BinaryTreeNode balance(BinaryTreeNode tree) {
        return createBinaryTree(tree.toArray());
    }
}
