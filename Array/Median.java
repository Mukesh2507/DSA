package com.Array;

import java.util.Arrays;

public class Median {



    private static double findMedianOfTwoSortedArrays(int input1 [],int input2 []){
        //if input length is greter than switch them so that input is smaller than input2

        if (input1.length>input2.length){

            return findMedianOfTwoSortedArrays(input2,input1);
        }
        int x = input1.length;
        int y = input2.length;
        int low = 0;
        int high = x;
        while(low<=high){


            int partitionX = (low+high)/2;
            int partitionY = (x + y +1)/2 -partitionX;

            //if partition is 0 it means nothing is there on left side.
            //if partition is length of input then there is nothing on right side


            int maxLeftX = (partitionX==0) ? Integer.MIN_VALUE:input1[partitionY-1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE:input1[partitionX];



            int maxLeftY = (partitionY==-0) ? Integer.MIN_VALUE:input2[partitionY-1];
            int minRightY  = (partitionY == y) ? Integer.MAX_VALUE :input2[partitionY];

            if(maxLeftX<=minRightY && maxLeftY <=minRightX) {

                //we have partititon array into correct place

                if ((x + y) % 2 == 0) {

                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY));
                } else {

                    return ((double) Math.max(maxLeftX, maxLeftY));
                }
            }
                else if (maxLeftX>minRightY){

                    high = partitionX-1;
                }else{

                    low = partitionX +1;
                }


            }
    throw  new IllegalArgumentException();
        }







    public static void main(String[] args) {
        int [] x = {1,3,8,9,15};
        int [] y  = {7,11,19,21,18,25};

        //Median mm = new Median();
        //mm.findMedianOfTwoSortedArrays(x,y);

        System.out.println(findMedianOfTwoSortedArrays(x,y));
    }






}
