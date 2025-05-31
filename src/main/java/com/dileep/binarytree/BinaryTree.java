package com.dileep.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T val) {
        root= insert(root, val);
    }

    public BinaryNode<T> insert(BinaryNode<T> root, T val) {
        var newNode = new BinaryNode<T>(val);
        if (root == null) {
            root = newNode;
        } else if (val.compareTo(root.val) < 0) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public List<T> inorder() {
        List<T> result = new ArrayList<T>();
        inorder(root, result);
        return result;
    }

    private void inorder(BinaryNode<T> root, List<T> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}
