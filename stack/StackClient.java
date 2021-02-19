package com.stack;

import java.util.Stack;

public class StackClient{



public static  void main(String[]args){

   // Stack<Integer>  stack =new Stack<>();

   // CustomStack  stack = new CustomStack();
  //  stack.push(2);
    //stack.push(4);
    //stack.push(19);
   // stack.push(5);
    //stack.push(6);
    //System.out.println(stack.pop());
DynamicStack stack=new DynamicStack();
    for (int i=0;i<15;i++) {

        stack.push(i);
        System.out.println(i);
    }
        System.out.println(stack.pop());




        }}
