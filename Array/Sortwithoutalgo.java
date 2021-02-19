package com.Array;

import java.util.Arrays;

//q.4 given array which consist of only 0,1,2,sort the array without using any sorting algorithm
public class Sortwithoutalgo {


    public static void main(String[] args) {
        int[] a ={2,1,0};
        int n = a.length;

        Arrays.sort(a);

       for (int i =0 ;i<n;i++){
           System.out.println(a[i]);

        //    for (int j=i+1;j<n;j++){


              //  if(a[i]>a[j]){

                //    int temp = a[i];
                  //  a[i]=a[j];
                    //a[j]=temp;

          //  System.out.println(a[i]);
        }
    }
}
