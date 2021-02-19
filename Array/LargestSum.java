package com.Array;


//find the largest sum of contiguos array using kadanes algo (v.v.vv.v.imp)

/**
 * find the largest sum of contiguos sub array(kadane's algorithm)
 * Given an array of N element,find the maximum possible sum of a contigus subarray.
 * An array contain can conatin both postive and negative values;
 * arr[] ={1,2,-5,4,3,8,5}
 * sub array- an array inside array .for example :{1,2,-5},{4,3},{-5,4,3}etc
 * the maximum sum of a sub-array in this array is 20 and subarray is {4,3,8,5};
 * algorithm
 *
 *
 * maxSum = Integer.MIM_VALUE;//means maxSum always>0 because min value of integer is greater then 0
 *sum =0;
 *
 * for(i=0;i<a.length;i++){ lets take a[0]->1 ,a[1]->2,a[2]->-5
 *
 *
 *     sum =sum + arr[i]; //0=0+1=1, 1=1+2=3, 3=3-5=-2
 *     if(maxSum <sum){ 0<1 ,1<3,3<-2
 *
 *     maxSum = sum;  maxSum =1,maxSum=3
 *
 * }
 * if(sum<0){  -2<0
 *
 *     sum=0;
 *     }
 * }
 * note this code is not applied when all element are negative
 */











public class LargestSum {


    public static void main(String[] args) {
        int [] a ={1,2,-5,4,3,8,5};

        int maxSum =Integer.MIN_VALUE;
        int sum =0 ;


        for (int i =0 ;i<a.length;i++){
            sum =sum + a[i];

            if (maxSum < sum){
                maxSum=sum;
            }
            if (sum<0){
                sum =0 ;
            }


        }
        System.out.println(maxSum);
    }


}
