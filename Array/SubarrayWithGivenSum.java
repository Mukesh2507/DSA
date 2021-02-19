package com.Array;
/* given an array arr[] ={1,2,3,4,5}
sum = 9
ans is  2 and 4 th position
 */


import java.util.Arrays;

public class SubarrayWithGivenSum {
    public static void main(String[]args){
         int arr [] = {1,2,3,4,5};
         int n = arr.length;
         int k = 6;
        System.out.println(Arrays.toString(subArray(arr,n,k)));


}

    private static int[] subArray(int[] arr, int n, int k) {

        int start = 0;
        int end = 1;
        int sum = arr[0];
        while(end<=n){

            while(sum>k && start<end-1){

                sum = sum -arr[start];
                start++;

            }
            if (sum==k){

                return new int [] {start,end-1};
            }

            if (end<n){


                sum = sum +arr[end];
                end++;
            }


        }
        return new int [] {-1};
    }
    }
