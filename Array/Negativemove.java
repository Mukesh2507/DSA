package com.Array;


import java.util.Arrays;

//move all the negative element to one side of the array
public class Negativemove {


    public static void main(String[] args) {
        int[] a = {-1, 4, -5, 6, -8, 3};
        //   int[] a = {0,1,0,2,0,3,4};

        for (int i = 0; i < a.length; i++) {

            for (int j =i+1;j<a.length;j++){


                if(a[i]<a[j]){

                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
