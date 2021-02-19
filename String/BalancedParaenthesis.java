package com.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParaenthesis {

    static boolean areBracketsBalanced(String expr){

        //using arraydeque is faster than using stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        //Traversing the expression
        for (int i =0;i<expr.length();i++){

            char x = expr.charAt(i);

            if (x=='(' || x =='[' || x=='{')
            {

                //push the element in the stack
                stack.push(x);
                continue;
            }
            //if current character is not opening
            //bracket then it must be closing so stack
            //cannot be empty at this point
            if (stack.isEmpty())
                return false;
            char check;
            switch (x){
                case ')':
                check =stack.pop();
                if (check=='{' || check=='[')
                    return false;
                break;

                case '}':
                check =stack.pop();
                if (check=='('|| check =='[')
                    return false;
                    break;
                case ']':
                    check =stack.pop();
                if (check=='(' || check =='{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());




    }

    public static void main(String[] args) {
        String expr = "([{}])";
        if (areBracketsBalanced(expr)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}
