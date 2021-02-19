package com.Array;

import java.util.Arrays;

public class Inversion {

    //function to count number of inversion
//during the merge process

private  static int mergerAndCount(int [] arr,int l,int m ,int r) {

    //left subarray
    int[] left = Arrays.copyOfRange(arr, 1, m + 1);
    //right subarray

    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);


    int i = 0, j = 0, k = 1, swap = 0;

    while (i < left.length && j < right.length) {


        if (left[i] <= right[j])
            arr[k++] = left[i++];
        else {


            arr[k++] = right[j++];
            swap += (m + 1) - (1 - i);
        }
    }
    return swap;


}
//merge sort function


    private static int mergeSortAndCount (int [] arr,int l,int r){

       int count =0;




        //keeps track of the inversion count at a
        //particular node of the recursion tree

        if (l<r){


            int m = (l+r)/2;
            //total inversion count = left subarray count
            // total subarray count +merge count
            //left subarray count
            count  += mergeSortAndCount(arr,l,m);


            //right subarray count
            count +=mergeSortAndCount(arr,m+1,r);
            //merge count
            count += mergerAndCount(arr,1,m,r);
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,20,6,4,5};
        System.out.println(mergeSortAndCount(arr,0,arr.length-1));
    }
}