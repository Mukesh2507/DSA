package com.arrays;

public class AVLTree1 {



    private class Node{

         private int data;
          Node left;
          Node right;
          int height;



     Node(int item){

        this.data=data;
    }

    private Node root;


     public void insert(int item){

         this.root = insert(this.root,item);
    }

    public Node insert(Node node,int item){


         if (node==null){

             Node n= new Node(item);
             return n;

         }else if (item>node.data)
         {

             node.right=insert(node.right,item);
         }else if (item<node.data){

             node.left=insert(node.left,item);
         }
         return node;

     }
     public void display(){
         display(this.root);
     }
     public void display(Node node){

         if (node==null){
             return ;
         }
         String str ="";
         if (node.left==null){
              str +=".";
         }else{

             str +=node.left.data;
         }

           str="=>" +node.data + "<=";
         if (node.right==null){
             str +=".";
         }else
         {
             str +=node.right.data;
         }
         System.out.println(str);
         display(node.left);
         display(node.right);
     }


    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(27);
        tree.insert(19);
        tree.insert(16);
        tree.display();

    }
}












