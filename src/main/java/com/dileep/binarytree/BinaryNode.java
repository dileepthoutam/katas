package com.dileep.binarytree;

public class BinaryNode<T> {
    T val;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
