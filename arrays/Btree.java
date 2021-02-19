package com.arrays;

import java.util.Scanner;

public class Btree {


    static class Node{


        Node left,right;
         int data;
        Node(int data){
            this.data=data;
        }

    }
    static Node createTree(){
        Node root = null;
        System.out.println("enter data");
        int data=sc.nextInt();
        if (data==-1) return null;
        root = new Node(data);

        System.out.println("enter for left " +data);
        root.left=createTree();
        System.out.println("enter for right "+data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);



    }
    static void preOrder(Node root){

        if (root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);




    }
   static Scanner sc =null;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
       Node root= createTree();
       inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
    }
}
