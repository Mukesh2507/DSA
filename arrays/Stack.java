package com.arrays;

import java.util.Scanner;

public class Stack {
    static Scanner sc = new Scanner(System.in);
    static int stack[], top = -1, Size;

    static {
        Stack.create();
    }

    private static void create() {
        int Size;
        System.out.println("enter size of stack :");
        Size = Stack.sc.nextInt();
        Stack.stack = new int[Size];
        System.out.println("stack created with size :" + Size);
    }


    public static void main(String[] args) {


        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.Travese");
            System.out.println("5.quit");
            System.out.print("enter your choice");
            int choice = Stack.sc.nextInt();
            int item;
            switch (choice) {

                case 1:
                    System.out.println("enter element :");
                    item = sc.nextInt();
                    Stack.push(item);
                    break;
                case 2:
                    item = Stack.pop();
                    if (item == 0) {

                        System.out.println("stack is underflow \n");
                    } else {
                        System.out.println("popped item is :" + item);
                    }
                    break;
                case 3:
                    item = Stack.peek();
                    if (item == 0) {

                        System.out.println("stack is underflow \n");
                    } else {
                        System.out.println("peek item is :" + item);
                    }
                    break;
                case 4:
                    Stack.traverse();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("this is invalid choice");


            }

        }


    }

    static void push(int item) {

        if (Stack.isFull()) {
            System.out.println("stack is overflow\n");
        } else {
            stack[++top] = item;


        }

    }

    static boolean isFull() {
        if (top == Size - 1) {
            return true;
        } else {
            return false;
        }
    }

    static int pop() {

        if (isEmpty()) {
            return 0;
        } else {
            return stack[top--];
        }

    }

    static boolean isEmpty() {

        if (top == -1) {
            return true;
        } else {
            return false;
        }


    }

    static int peek() {

        if (isEmpty()) {
            return 0;
        } else {
            return stack[top];
        }

    }


    static void traverse() {

        if (Stack.isEmpty()) {
            System.out.println("stack is empty");
        } else {
            System.out.println("element of stack :");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

