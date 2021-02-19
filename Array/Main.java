package com.Array;


import java.util.Scanner;

// q.1 reverse array
public class Main {


    public static void main(String[] args) {

        int [] arr = { 3,4,5,6,7};
        pintArrayOfInteger(arr);

    }

    private static void pintArrayOfInteger(int[] arr) {

        int n = arr.length;
        for (int i =n-1 ;i>=0;i--){


            System.out.println(arr[i]);
        }

    }
}
