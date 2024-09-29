package binarytree;

public class App {
    public static void main(String[] args) {
        //Initialize tree manually
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.leftChild = new BinaryTreeNode(3);
        root.rightChild = new BinaryTreeNode(8);
        root.rightChild.rightChild = new BinaryTreeNode(4);
        System.out.println(BinaryTree.balance(root));

        //Initialize and balance tree from array
        int[] BinaryTreeArray = {1, 4, 3, 5, 6, 8, 2, 12, 4, 15, 6, 9};
        BinaryTreeNode tree = BinaryTree.createBinaryTree(BinaryTreeArray);
        System.out.println(tree);
        assert tree != null;
        System.out.println(BinaryTree.balance(tree));
    }
}
