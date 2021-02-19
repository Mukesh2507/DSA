package com.Array;


//left rotate array by one postion
public class Leftrotate {


    public static void main(String[] args) {
        int [] a = {10,20,30,40,50};
     //storing the element in the temp
        int temp =a[0];
        for (int i =1;i<a.length;i++){

            a[i-1]=a[i];
        }
        //store the temp value at the last postion
        a[a.length-1] =temp;
        for (int i :a
             ) {

            System.out.println(i);

        }
    }
}
