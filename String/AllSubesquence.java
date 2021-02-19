package com.String;

public class AllSubesquence {

    public static void printSubsequence(String input,String outputSoFar) {

        if (input.length() == 0) {

            System.out.println(outputSoFar);
            return;
        }
        //we chose to not add first character
        printSubsequence(input.substring(1),outputSoFar);
        //we choose to add
        printSubsequence(input.substring(1), outputSoFar + input.charAt(0));


    }
    public static void  printSubsequence(String input){

        printSubsequence(input,"");

    }

    public static void main(String[] args) {

        printSubsequence("abc");
    }



}
