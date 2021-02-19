package com.Array;

import java.util.HashMap;

public class Majority {


    public static void main(String[] args) {
        int [] nums =new int[]{7, 7, 5, 1, 2, 2};


        System.out.println("  " +majorityElement(nums));

    }

    private static int majorityElement(int[] nums) {

          int count =0;
          int candidate =0;
        //  HashMap<Integer,Integer>  nums = new HashMap<>(n);
        for (int num: nums  // num : 7 ,num 7........goes on
             ) {
               if (count==0){

                   candidate=num; //intializing candidate as num
               }
               if (num== candidate)count +=1;
               else
                   count -= 1;
        }



        return candidate;



    }
}



