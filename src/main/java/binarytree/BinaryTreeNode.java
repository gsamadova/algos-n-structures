package binarytree;

import java.util.ArrayList;

public class BinaryTreeNode {
    public int val = -1;
    public BinaryTreeNode leftChild;
    public BinaryTreeNode rightChild;

    public BinaryTreeNode(int value) {
        this.val = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        String left = (this.leftChild == null) ? "" : this.leftChild.toString();
        String right = (this.rightChild == null) ? "" : this.rightChild.toString();
        return this.val + " " + left + right;
    }

    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> leftList = (this.leftChild == null) ? new ArrayList<>() : this.leftChild.toArrayList();
        ArrayList<Integer> rightList = (this.rightChild == null) ? new ArrayList<>() : this.rightChild.toArrayList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(val);
        list.addAll(leftList);
        list.addAll(rightList);
        return list;
    }

    public int[] toArray() {
        return toArrayList().stream().mapToInt(i -> i).toArray();
    }
}
