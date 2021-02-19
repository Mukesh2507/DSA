package com.stack;

import java.util.Scanner;

//implement two stack in one array
public class TwoStackInOneArray {
    int size;
    int top1,top2;
    int arr[];

    //constructor
         TwoStackInOneArray(int n){
        arr = new int[n];
        size = n;
        top1=-1;
        top2=size;
    }

    //method to push the x element to stack1
    void push1(int x){
        //ther is at leas one empty space for the new element
        if (top1<top2-1){
            top1++;
            arr[top1]=x;
        }else{
            System.out.println("stack is overflow");
            System.exit(1);
        }


    }

//method to push an element x to stack2
 void push2(int x){

        if (top1<top2-1){
            top2--;
            arr[top2]=x;
        }
        else{

            System.out.println("stack is overflow");
            System.exit(1);
        }
 }

 //method to pop an element from first stack
    int pop1(){

        if (top1>=0){

            int x =arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("underflow");
            System.exit(1);
        }
        return 0;
    }
    //method to pop2
    int pop2(){

        if (top2<size){
            int x = arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("underflow");
            System.exit(1);
        }return 0;
    }
    public static void main(String [] args){

        TwoStackInOneArray ts = new TwoStackInOneArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push1(15);
        ts.push2(11);
        ts.push1(7);
        //ts.push2(22);
        System.out.println("popped element from " +"stack1 : " +ts.pop1());
        ts.push2(40);
        System.out.println("popped element from " + "stack2 is : " +ts.pop2());
    }
}