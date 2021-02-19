package com.stack;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Stack;

public class StackMin {

    Stack<Integer> s;
    Integer minEle;

    StackMin() {

        s = new Stack<Integer>();

    }

    //prints mimimum number in the entire stack
    void getMin() {
        if (s.isEmpty())


            System.out.println("Stack is empty");
            //variable minEle stores the minimu element
            //in the stack

        else

            System.out.println("Minimum Element in the " + " stack is :" + minEle);

    }
    //prints top element of MyStack

    void peek() {

        if (s.isEmpty()) {

            System.out.println("Stack is empty ");
            return;
        }
        Integer t = s.peek(); //top element
        System.out.println("Top Most Element is : ");
        //if t<minEle means minEle stores
        //value of t

        if (t < minEle)
            System.out.println(minEle);

        else
            System.out.println(t);
    }

    //remove the top element from stack
    void pop() {

        if (s.isEmpty()) {

            System.out.println("Stack is empty ");
        }
        System.out.println("Top Most Element Removed :");
        Integer t = s.pop();
        if (t < minEle) {

            System.out.println(minEle);
            minEle = 2 * minEle - t;
        } else
            System.out.println(t);
    }

    void push(Integer x) {
        if (s.isEmpty()) {

            minEle = x;
            s.push(x);
            System.out.println("Number Inserted is : " + x);
            return;
        }

        //if new number is less than original minEle
        if (x < minEle) {

            s.push(2 * x - minEle);
            minEle = x;
        } else {

            s.push(x);
            System.out.println("Number Inserted: " + x);
        }


    }





        public static void main(String[] args) {
            StackMin stackMin = new StackMin();
            stackMin.push(3);
            stackMin.push(4);
            stackMin.getMin();
            stackMin.pop();
            stackMin.pop();
            stackMin.push(5);
            stackMin.push(8);
            stackMin.getMin();
            stackMin.pop();
            stackMin.pop();
            stackMin.peek();
        }
    }


