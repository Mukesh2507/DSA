package com.arrays;

public class AVLclient {


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(27);
        tree.insert(19);
        tree.insert(16);
        tree.display();


    }
}
