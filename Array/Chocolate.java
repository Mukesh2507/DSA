package com.Array;

import java.util.Arrays;

public class Chocolate {

    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};

        int n = arr.length;

        Arrays.sort(arr);//first step sort
        System.out.println(distribution(arr, n));


    }

    private static int distribution(int[] arr, int n) {
        int m = 3;
        int mindiff = Integer.MAX_VALUE;


        for (int i = 0; i + m - 1 < n; i++) {

            int diff = arr[i + m - 1] - arr[i];


            if (diff < mindiff) {

                mindiff = diff;
            }


        }
        return mindiff;
    }
}