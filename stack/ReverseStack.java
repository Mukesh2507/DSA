package com.stack;

  import java.util.*;
//implement the stack and reverse the string
public class ReverseStack {
    int top;
     int size;
     char[] a ;
    ReverseStack(int n ) {
         top = -1;
        size = n;
        a = new char[size];
    }

    boolean isEmpty(){

      return  (top < 0);

    }
boolean push(char x){
    if (top >= size){
        System.out.println("stack overflow");
        return false;
    }
    else {

            a [++top]= x;
            return true;
    }

    }
    char pop(){
        if (top < 0){

            System.out.println("Stack is undderflow");
            return 0;
        }
        else{

            char x = a[top--];
            return x;
        }


    }
}
class Main {

    public static void reverse(StringBuffer str) {


        int n = str.length();
        ReverseStack obj = new ReverseStack(n);

        for (int i = 0; i < n; i++)
            obj.push(str.charAt(i));
        for (int i = 0; i <n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }


    }
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("GeeksQuiz");
        reverse(s);
        System.out.println("Reversed string is " +s +"  ");
    }

}





