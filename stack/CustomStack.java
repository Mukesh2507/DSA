package com.stack;

public class CustomStack {

    protected int[] data; //declaration
    private final int DEFAULT_SIZE = 10;
    protected int top = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];  //initialization
    }


    public CustomStack(int Size) { //id default size done you want to add more then its helpful to construct onther


        this.data = new int[Size];
    }


    public void push(int item) {
        if (isFull()) {
            System.out.println("overflow");
            return;
        }
        this.data[++top] = item;

    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("underflow");
        }


        return this.data[top--];
    }

    public boolean isEmpty() {
        return top == -1;


    }

    public boolean isFull() {

        return top == this.data.length - 1;


    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("underflow");
            return null;
        }
        return this.data[top];
    }
}
