package com.Array;
//find all pair of element in array whose sum is equal to given number
//int arr = {4.6,5,10,8,2}
 //int n =10;
public class Sum {





    public static void main(String[] args) {


        int [] arr = {4,6,5,-10,8,2,5};
        int n =10;

        findThePairs(arr,n);
    }

    private static void findThePairs(int[] arr, int n) {


        for (int i =0;i<arr.length;i++){

            for (int j =i+1;j<arr.length;j++){


                if (arr[i]+arr[j]==n){
                    System.out.println(arr[i] +"  " +arr[j] +" =" +n);
                }
            }
        }
    }


}
