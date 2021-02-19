package com.stack;

import com.arrays.Stack;

import java.util.ArrayList;
import java.util.Arrays;

//find the middle element of stack
public class MiddleElement {


     ArrayList<Integer> middleElement;

    public MiddleElement(){
        middleElement = new ArrayList<Integer>();
    }

    public int push(int value){
        middleElement.add(value);
        return middleElement.size()-1;
    }
    public int pop(){

        int value = middleElement.get(middleElement.size()-1);
        middleElement.remove(middleElement.size()-1);
        return value;

    }
    public int getMiddle()
    {

        return middleElement.get(middleElement.size()/2);
    }
    public int deleteMiddle(){

        int value =middleElement.get(middleElement.size()/2);
        middleElement.remove(middleElement.size()/2);
        return value;
    }

    public static void main(String[] args) {

            MiddleElement md = new MiddleElement();
            md.push(23);
            md.push(22);
            md.push(25);
            md.push(76);
            md.deleteMiddle();
        System.out.println(md.deleteMiddle() );
    }




}
